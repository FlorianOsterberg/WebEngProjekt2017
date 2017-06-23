package webeng.presentation.managedbeans;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import webeng.businesslogic.UserManager;
import webeng.transferobjects.User;

@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private UserManager manager;
	private User user;

	public UserBean() {
		
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login(User user) {
		if(manager.loginSucceeded(user)) {
			
		} else {
			
		}
		return "/startseite.xhtml";
	}
	
	public String logout(User user) {
		return "";
	}
	
	@PostConstruct
	public void init() {
		
	}
	
}//end class UserBean