package cn.edu.scau.cmi.zhangjiayi.hibrenate.domain;

import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */
public class Course extends AbstractCourse implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(Teacher teacher, String name) {
		super(teacher, name);
	}

	/** full constructor */
	public Course(Teacher teacher, String name, Double credits, Set students, Set scores) {
		super(teacher, name, credits, students, scores);
	}

}
