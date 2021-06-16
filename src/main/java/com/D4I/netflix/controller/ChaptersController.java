package com.D4I.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.D4I.netflix.model.Chapters;
import com.D4I.netflix.service.ChaptersServiceI;

@RestController
public class ChaptersController {

	@Autowired
	@Qualifier("ChaptersServiceImpl")
	private ChaptersServiceI chaptersService;

	@GetMapping("series/{series-id}/seasons/{season-number}/chapters")
	public List<Chapters> listAllChapters() {
		return chaptersService.listAllChapters();
	}

	@GetMapping("series/{series-id}/seasons/{season-number}/chapters/{chapter-number}")
	public Chapters listChaptersById(@PathVariable int id) {
		return chaptersService.findById(id);
	}

}
