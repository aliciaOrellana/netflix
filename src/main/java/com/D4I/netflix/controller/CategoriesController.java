package com.D4I.netflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.D4I.netflix.model.Categories;
import com.D4I.netflix.service.CategoriesServiceI;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

	@Autowired
	@Qualifier("categoriesServiceImpl")
	private CategoriesServiceI categoriesService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Categories> listAllCategories() {
		return categoriesService.listAllCategories();
	}

	@GetMapping(path="/{category-id}", produces = "application/json")
	public Categories listCategoriesById(@PathVariable int id) {
		return categoriesService.findById(id);
	}

}
