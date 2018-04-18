package main;

public class User {
	
	private String userName;
	private int userId;
	private float userMoney;
	
	public User(String userName, int userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(float userMoney) {
		this.userMoney = userMoney;
	}

}
