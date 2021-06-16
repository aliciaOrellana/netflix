package com.D4I.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.D4I.netflix.model.TvShows;
import com.D4I.netflix.service.TvShowsServiceI;

@RestController
@RequestMapping("/tv-shows")
public class TvShowsController {

	@Autowired
	@Qualifier("TvShowsServiceImpl")
	private TvShowsServiceI tvShowsService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<TvShows> listAllTvShows() {
		return tvShowsService.listAllTvShows();
	}

	@GetMapping(path="/tvShows/{tv-show-id}", produces = "application/json")
	public TvShows listTvShowsById(@PathVariable int id) {
		return tvShowsService.findById(id);
	}

}
