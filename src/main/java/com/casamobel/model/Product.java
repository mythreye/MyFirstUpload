package com.casamobel.model;

public class Product 
{
	private String pid;
	private String pname;
	private String catagory;
	private String sellerid;
	private String description;
	private int quantity;
	private int price;
	
	public Product(String pid, String pname, String catagory, String sellerid, String description, int quantity,
			int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.catagory = catagory;
		this.sellerid = sellerid;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
