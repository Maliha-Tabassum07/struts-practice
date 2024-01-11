package com.training.java.struts;

import org.apache.struts.action.ActionForm;

public class ProductForm extends ActionForm{
    private String name;
    private String quantity;
    private Double price;
    public ProductForm() {
    	
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setQuantity(String quantity) {
    	this.quantity=quantity;
    }
    public void setPrice(Double price) {
    	this.price=price;
    }
    public String getName() {
    	return name;
    	}
    public String getQuantity() {
    	return quantity;
    	}
    public Double getPrice() {
    	return price;
    	}
}
