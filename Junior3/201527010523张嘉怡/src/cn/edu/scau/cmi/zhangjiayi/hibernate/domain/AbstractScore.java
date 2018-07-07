package cn.edu.scau.cmi.zhangjiayi.hibernate.domain;

/**
 * AbstractScore entity provides the base persistence definition of the Score
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScore implements java.io.Serializable {

	// Fields

	private ScoreId id;
	private Course course;
	private Student student;
	private Double score;
	private Double gpa;

	// Constructors

	/** default constructor */
	public AbstractScore() {
	}

	/** minimal constructor */
	public AbstractScore(ScoreId id, Course course, Student student) {
		this.id = id;
		this.course = course;
		this.student = student;
	}

	/** full constructor */
	public AbstractScore(ScoreId id, Course course, Student student, Double score, Double gpa) {
		this.id = id;
		this.course = course;
		this.student = student;
		this.score = score;
		this.gpa = gpa;
	}

	// Property accessors

	public ScoreId getId() {
		return this.id;
	}

	public void setId(ScoreId id) {
		this.id = id;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getGpa() {
		return this.gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

}