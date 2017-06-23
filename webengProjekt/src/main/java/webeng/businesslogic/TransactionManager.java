package webeng.businesslogic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import webeng.data.DAOFactory;
import webeng.data.DAOFactory.Backend;
import webeng.transferobjects.Transaction;
import webeng.data.TransactionDAO;

public class TransactionManager {

	TransactionDAO transactionDao;
	
	public TransactionManager() {
		transactionDao = DAOFactory.getDAOFactory(Backend.H2).getTransactionDAO();
	}
	
	public void addTransaction(Transaction transaction) {
		transactionDao.addTransaction(transaction);
	}
	
	public Transaction getTransaction(Transaction transaction) {
		return new Transaction(1,1,1,1,1.0F,new Date(System.currentTimeMillis()));
//		return transactionDao.getTransaction(transaction);
	}
	
	public List<Transaction> findTransactions() {
		List<Transaction> list = new ArrayList<Transaction>();
		list.add(new Transaction(1,1,1,1,1.0F,new Date(System.currentTimeMillis())));
		return list;
//		return transactionDao.findTransactions();
	}
	
}
