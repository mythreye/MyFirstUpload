package com.casamobel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.casamobel.dao.ProductDao;
import com.casamobel.model.Product;

@Controller
public class ProductController
{
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/product")
	public ModelAndView viewProduct()
	{
		List<Product> list=dao.addProduct();
		System.out.println(list);
		return new ModelAndView("product","list", list);		
	}

}
