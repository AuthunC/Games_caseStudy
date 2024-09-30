package com.game;

public class User implements IValidate{

	private String userId;
	private String password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	void addUser(String userid, String password) { // this method is used to initialize user.
		this.userId=userid;
		this.password=password;
	}

	@Override
	public boolean IsAuthenticated(String userid, String password) {
		if(this.userId.equals(userid) && this.password.equals(password))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}

}
