package cn.edu.scau.cmi.zhangjiayi.hibrenate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

	// Fields

	private String id;
	private Schoolclass schoolclass;
	private String name;
	private Set courses = new HashSet(0);
	private Set scores = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractStudent() {
	}

	/** minimal constructor */
	public AbstractStudent(Schoolclass schoolclass, String name) {
		this.schoolclass = schoolclass;
		this.name = name;
	}

	/** full constructor */
	public AbstractStudent(Schoolclass schoolclass, String name, Set courses, Set scores) {
		this.schoolclass = schoolclass;
		this.name = name;
		this.courses = courses;
		this.scores = scores;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Schoolclass getSchoolclass() {
		return this.schoolclass;
	}

	public void setSchoolclass(Schoolclass schoolclass) {
		this.schoolclass = schoolclass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

}