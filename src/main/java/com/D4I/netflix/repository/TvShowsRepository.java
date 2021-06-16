package com.D4I.netflix.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.D4I.netflix.model.TvShows;

@Repository
@Qualifier("TvShowsRepository")
public interface TvShowsRepository extends JpaRepository<TvShows, Integer> {

}
