package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

/**
 * ScoreId entity. @author MyEclipse Persistence Tools
 */
public class ScoreId extends AbstractScoreId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScoreId() {
	}

	/** full constructor */
	public ScoreId(String student, String course) {
		super(student, course);
	}

}
