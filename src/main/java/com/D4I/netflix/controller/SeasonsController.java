package com.D4I.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.D4I.netflix.model.Seasons;
import com.D4I.netflix.service.SeasonsServiceI;

@RestController
@RequestMapping("/series")
public class SeasonsController {

	@Autowired
	@Qualifier("SeasonsServiceImpl")
	private SeasonsServiceI seasonsService;

	@GetMapping("/{series-id}/seasons")
	public List<Seasons> listAllSeasons() {
		return seasonsService.listAllSeasons();
	}

	@GetMapping("/{series-id}/seasons/{season-number}")
	public Seasons listSeasonsById(@PathVariable int id) {
		return seasonsService.findById(id);
	}

}
