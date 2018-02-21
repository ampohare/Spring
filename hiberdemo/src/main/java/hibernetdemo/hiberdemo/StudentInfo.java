package hibernetdemo.hiberdemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table (name="stutable")
//@DiscriminatorValue(value="child1")
public class StudentInfo extends CollegeInfo{
	@Column(name="stud_id")
	int studentId;
	@Column(name="stud_name")
	String studentName;
	public StudentInfo() {
		super();
		
	}
	/*public StudentInfo(int collegeId, String collegeName) {
		super(collegeId, collegeName);
		
	}*/
	public StudentInfo(int collegeId, String collegeName, int studentId, String studentName) {
		super(collegeId, collegeName);
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", collegeId=" + collegeId
				+ ", collegeName=" + collegeName + "]";
	}
	
	

}
