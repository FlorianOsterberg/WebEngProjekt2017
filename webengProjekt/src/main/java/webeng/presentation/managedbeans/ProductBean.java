package webeng.presentation.managedbeans;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import webeng.businesslogic.ProductManager;
import webeng.transferobjects.Product;

@ManagedBean(name = "productBean")
@ViewScoped
public class ProductBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	Product product;
	ProductManager manager;

	public ProductBean() {
		
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@PostConstruct
	public void init() {
		manager = new ProductManager();
	}
	
	
}//end class ProductBean