package hibernetdemo.hiberdemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value="child2")
@Table(name="lecttable") 
public class LecturerInfo extends CollegeInfo{
	@Column(name="lecturer_id")
	int lecturerId;
	@Column(name="lecturer_name")
	String lecturerName;
	public LecturerInfo() {
		super();
		
	}
	/*public LecturerInfo(int collegeId, String collegeName) {
		super(collegeId, collegeName);
		
	}*/
	public LecturerInfo(int collegeId, String collegeName, int lecturerId, String lecturerName) {
		super(collegeId, collegeName);
		this.lecturerId = lecturerId;
		this.lecturerName = lecturerName;
	}
	public int getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(int lecturerId) {
		this.lecturerId = lecturerId;
	}
	public String getLecturerName() {
		return lecturerName;
	}
	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}
	@Override
	public String toString() {
		return "LecturerInfo [lecturerId=" + lecturerId + ", lecturerName=" + lecturerName + ", collegeId=" + collegeId
				+ ", collegeName=" + collegeName + "]";
	}
	

}
