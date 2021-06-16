package com.D4I.netflix.service;

import java.util.List;

import com.D4I.netflix.model.Categories;

public interface CategoriesServiceI {

	List<Categories> listAllCategories();
	Categories findById(final int id);

}
