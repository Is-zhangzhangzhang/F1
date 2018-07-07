package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
public class Teacher extends AbstractTeacher implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** full constructor */
	public Teacher(String name, Set schoolclasses, Set courses) {
		super(name, schoolclasses, courses);
	}

}
