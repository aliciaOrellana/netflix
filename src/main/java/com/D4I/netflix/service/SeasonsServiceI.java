package com.D4I.netflix.service;

import java.util.List;

import com.D4I.netflix.model.Seasons;

public interface SeasonsServiceI {

	List<Seasons> listAllSeasons();
	Seasons findById(final int id);

}
