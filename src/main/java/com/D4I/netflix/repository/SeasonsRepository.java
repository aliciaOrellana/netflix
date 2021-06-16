package com.D4I.netflix.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.D4I.netflix.model.Seasons;

@Repository
@Qualifier("SeasonsRepository")
public interface SeasonsRepository extends JpaRepository<Seasons, Integer> {

}