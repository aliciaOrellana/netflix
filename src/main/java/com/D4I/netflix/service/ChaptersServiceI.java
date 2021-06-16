package com.D4I.netflix.service;

import java.util.List;

import com.D4I.netflix.model.Chapters;

public interface ChaptersServiceI {

	List<Chapters> listAllChapters();
	Chapters findById(final int id);

}
