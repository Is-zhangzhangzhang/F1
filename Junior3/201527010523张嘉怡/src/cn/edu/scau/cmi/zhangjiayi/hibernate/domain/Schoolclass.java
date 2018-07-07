package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

import java.util.Set;

/**
 * Schoolclass entity. @author MyEclipse Persistence Tools
 */
public class Schoolclass extends AbstractSchoolclass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Schoolclass() {
	}

	/** minimal constructor */
	public Schoolclass(Teacher teacher) {
		super(teacher);
	}

	/** full constructor */
	public Schoolclass(Teacher teacher, Set students) {
		super(teacher, students);
	}

}
