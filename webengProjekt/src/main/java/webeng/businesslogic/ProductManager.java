package webeng.businesslogic;

import java.util.List;

import webeng.data.DAOFactory;
import webeng.data.ProductDAO;
import webeng.data.DAOFactory.Backend;
import webeng.transferobjects.Product;
import webeng.transferobjects.User;

public class ProductManager {

	ProductDAO productDAO;
	
	public ProductManager() {
		productDAO = DAOFactory.getDAOFactory(Backend.H2).getProductDAO();
	}

	public void addProduct(int id, String name, float price, String category, String description){
		
		Product newProduct = new Product(id,name,price,category,description);
		productDAO.addProduct(newProduct);
	}
	
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}
}
