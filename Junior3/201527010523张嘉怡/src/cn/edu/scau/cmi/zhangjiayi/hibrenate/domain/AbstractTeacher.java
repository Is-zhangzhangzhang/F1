package cn.edu.scau.cmi.zhangjiayi.hibrenate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTeacher entity provides the base persistence definition of the
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTeacher implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private Set schoolclasses = new HashSet(0);
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTeacher() {
	}

	/** full constructor */
	public AbstractTeacher(String name, Set schoolclasses, Set courses) {
		this.name = name;
		this.schoolclasses = schoolclasses;
		this.courses = courses;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getSchoolclasses() {
		return this.schoolclasses;
	}

	public void setSchoolclasses(Set schoolclasses) {
		this.schoolclasses = schoolclasses;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}