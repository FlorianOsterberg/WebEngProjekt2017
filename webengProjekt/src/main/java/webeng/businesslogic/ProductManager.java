package webeng.businesslogic;

import webeng.data.DAOFactory;
import webeng.data.ProductDAO;
import webeng.data.DAOFactory.Backend;

public class ProductManager {

	ProductDAO productDao;
	
	public ProductManager() {
		productDao = DAOFactory.getDAOFactory(Backend.H2).getProductDAO();
	}
	
}
