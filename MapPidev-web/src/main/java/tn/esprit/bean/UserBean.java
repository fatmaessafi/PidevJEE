package tn.esprit.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.entities.User;
import tn.esprit.service.UserService;
import tn.esprit.service.UserServiceLocal;

@ManagedBean
@SessionScoped
public class UserBean {
	@EJB
	UserServiceLocal userServiceLocal;
	private String email;
	private String mdp;
	private User user;

	private boolean rememberMe = true;
	private boolean loggedIn;
	private tn.esprit.entities.User u = new tn.esprit.entities.User();

	public UserBean() {

	}

	public String doLogins() {
		String navigateTo = "";
		u = userServiceLocal.Login(email, mdp, true);
		System.out.println("Email=" + email + " Mdp=" + mdp);
		System.out.println("User=" + u);
		System.out.println("ok1");
		if (u != null) {
			System.out.println("ok2");
			navigateTo = "/xhtml/index?faces-redirect=true";
		}

		else {
			System.out.println("ok");
			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("bad credntials"));
			// navigateTo="/xhtml/erreur?faces-redirect=true";
		}
		System.out.println("ok3");
		return navigateTo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public tn.esprit.entities.User getU() {
		return u;
	}

	public void setU(tn.esprit.entities.User u) {
		this.u = u;
	}

	public User GetUserById(int idPatient) {
		u = userServiceLocal.GetUserById(idPatient);
		System.out.println("User profile=" + u);
		return u;
	}

	public User GetCurrentUser() {
		return UserService.CurrentUser;
	}
}
