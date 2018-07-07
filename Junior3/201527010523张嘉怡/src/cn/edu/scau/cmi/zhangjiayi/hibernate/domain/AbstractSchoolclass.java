package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSchoolclass entity provides the base persistence definition of the
 * Schoolclass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSchoolclass implements java.io.Serializable {

	// Fields

	private String name;
	private Teacher teacher;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSchoolclass() {
	}

	/** minimal constructor */
	public AbstractSchoolclass(Teacher teacher) {
		this.teacher = teacher;
	}

	/** full constructor */
	public AbstractSchoolclass(Teacher teacher, Set students) {
		this.teacher = teacher;
		this.students = students;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}