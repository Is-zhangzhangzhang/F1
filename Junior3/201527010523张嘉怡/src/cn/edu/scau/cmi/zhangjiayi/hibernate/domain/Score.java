package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */
public class Score extends AbstractScore implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** minimal constructor */
	public Score(ScoreId id, Course course, Student student) {
		super(id, course, student);
	}

	/** full constructor */
	public Score(ScoreId id, Course course, Student student, Double score, Double gpa) {
		super(id, course, student, score, gpa);
	}

}
