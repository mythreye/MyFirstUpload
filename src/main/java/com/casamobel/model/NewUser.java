package com.casamobel.model;

public class NewUser 
{
	private String name,userid,email,phno,password;

		public NewUser()
		{
			
		}
	public NewUser(String name, String userid, String email, String phno, String password) {
		//super();
		this.name = name;
		this.userid = userid;
		this.email = email;
		this.phno = phno;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
