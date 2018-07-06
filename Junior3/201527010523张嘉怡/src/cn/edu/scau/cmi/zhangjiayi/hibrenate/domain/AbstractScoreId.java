package cn.edu.scau.cmi.zhangjiayi.hibrenate.domain;

/**
 * AbstractScoreId entity provides the base persistence definition of the
 * ScoreId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScoreId implements java.io.Serializable {

	// Fields

	private String student;
	private String course;

	// Constructors

	/** default constructor */
	public AbstractScoreId() {
	}

	/** full constructor */
	public AbstractScoreId(String student, String course) {
		this.student = student;
		this.course = course;
	}

	// Property accessors

	public String getStudent() {
		return this.student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractScoreId))
			return false;
		AbstractScoreId castOther = (AbstractScoreId) other;

		return ((this.getStudent() == castOther.getStudent()) || (this.getStudent() != null
				&& castOther.getStudent() != null && this.getStudent().equals(castOther.getStudent())))
				&& ((this.getCourse() == castOther.getCourse()) || (this.getCourse() != null
						&& castOther.getCourse() != null && this.getCourse().equals(castOther.getCourse())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStudent() == null ? 0 : this.getStudent().hashCode());
		result = 37 * result + (getCourse() == null ? 0 : this.getCourse().hashCode());
		return result;
	}

}