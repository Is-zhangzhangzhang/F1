package cn.edu.scau.cmi.zhangjiayi.spring.domain;

import java.io.Serializable;

public class Student implements Serializable {
	private String id;
	private String name;
	private String gender;
	private Teacher tutor;
	private static final long serialVersionUID = 1L;
	
	public Student(){
		
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
	public Teacher getTutor(){
		return this.tutor;
	}
	public void setTutor(Teacher tutor){
		this.tutor = tutor;
	}
}
