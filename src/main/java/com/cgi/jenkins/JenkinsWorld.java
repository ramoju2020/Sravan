package com.cgi.jenkins;

public class JenkinsWorld {

	private String val;
	private String tea;
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public String getTea() {
		System.out.println("Tea is not ready plz wait");
		return tea;
	}
	public void setTea(String tea) {
		this.tea = tea;
	}
	
	
	
}
