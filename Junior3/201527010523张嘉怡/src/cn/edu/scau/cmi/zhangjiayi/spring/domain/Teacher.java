package cn.edu.scau.cmi.zhangjiayi.spring.domain;

import java.io.Serializable;

public class Teacher implements Serializable {
	private String id;
	private String name;
	private String gender;
	private static final long serialVersionUID = 1L;
	
	public Teacher(){
		
	}
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
}
