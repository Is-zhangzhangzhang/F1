package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCourse entity provides the base persistence definition of the Course
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCourse implements java.io.Serializable {

	// Fields

	private String id;
	private Teacher teacher;
	private String name;
	private Double credits;
	private Set students = new HashSet(0);
	private Set scores = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCourse() {
	}

	/** minimal constructor */
	public AbstractCourse(Teacher teacher, String name) {
		this.teacher = teacher;
		this.name = name;
	}

	/** full constructor */
	public AbstractCourse(Teacher teacher, String name, Double credits, Set students, Set scores) {
		this.teacher = teacher;
		this.name = name;
		this.credits = credits;
		this.students = students;
		this.scores = scores;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCredits() {
		return this.credits;
	}

	public void setCredits(Double credits) {
		this.credits = credits;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

}