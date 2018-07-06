package cn.edu.scau.cmi.zhangjiayi.hibrenate.domain;

import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student extends AbstractStudent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Schoolclass schoolclass, String name) {
		super(schoolclass, name);
	}

	/** full constructor */
	public Student(Schoolclass schoolclass, String name, Set courses, Set scores) {
		super(schoolclass, name, courses, scores);
	}

}
