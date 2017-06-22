package webeng.businesslogic;

import webeng.data.DAOFactory;
import webeng.data.DAOFactory.Backend;
import webeng.data.TransactionDAO;

public class TransactionManager {

	TransactionDAO transactionDao;
	
	public TransactionManager() {
		transactionDao = DAOFactory.getDAOFactory(Backend.H2).getTransactionDAO();
	}
	
}
