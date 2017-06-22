package webeng.presentation.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "transactionBean")
@RequestScoped
public class TransactionBean implements Serializable {

	public TransactionBean() {
		
	}
	
}
