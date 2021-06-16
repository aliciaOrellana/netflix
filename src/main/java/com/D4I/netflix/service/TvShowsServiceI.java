package com.D4I.netflix.service;

import java.util.List;

import com.D4I.netflix.model.TvShows;

public interface TvShowsServiceI {

	List<TvShows> listAllTvShows();
	TvShows findById(final int id);

}
