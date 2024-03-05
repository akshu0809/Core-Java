package com.edubridge.encapsulation;
//parent class
public class SBI  {
	//private data members
	private String branch;
	private String ifscCode;
	
	//getters and setters
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "SBI [branch=" + branch + ", ifscCode=" + ifscCode + ", toString()=" + super.toString() + "]";
	}
	
	
}
