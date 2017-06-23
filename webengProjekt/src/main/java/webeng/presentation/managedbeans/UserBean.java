package webeng.presentation.managedbeans;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import webeng.businesslogic.UserManager;
import webeng.transferobjects.User;

@ManagedBean(name = "userBean")
@RequestScoped
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	UserManager manager;
	User user;

	public UserBean() {
		
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@PostConstruct
	public void init() {
		
	}
	
}//end class UserBean