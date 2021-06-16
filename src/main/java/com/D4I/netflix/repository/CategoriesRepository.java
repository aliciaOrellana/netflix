package com.D4I.netflix.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.D4I.netflix.model.Categories;

@Repository
@Qualifier("CategoriesRepository")
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
