package com.taiji.model;

public class User {
	private String usrname;
	private String pwd;
	public void setUsrname(String ausrname){
		this.usrname = ausrname;
	}
	public String getUsrname(){
		return this.usrname;
	}
	public void setPwd(String apwd){
		this.pwd = apwd;
	}
	public String getPwd(){
		return this.pwd; 
	}
}
