package com.casamobel.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.casamobel.model.Product;

@Repository
public class ProductDao 
{
	List<Product> ProList;
	
	public List<Product> addProduct()
	{
		ProList=new ArrayList<Product>();
		ProList.add(new Product("P123", "King Size Bed SilverWood","Bed","konnect","6*6 Bed",10,15000));
		ProList.add(new Product("P124", "Queen Size Bed RoseWood","Bed","FurnMart","5*6 Bed",10,10000));
		ProList.add(new Product("P223", "Sliver Wood 4 seater Dining Table","Dining Table","konnect","4 seater table",14,12000));
		ProList.add(new Product("P323", "Dresser RoseWood","Dre","Dressing Table","6 feet",5,10000));
		return ProList;	
	}
}