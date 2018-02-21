package hibernetdemo.hiberdemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="college_information")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
/*@DiscriminatorColumn
@DiscriminatorValue(value="parent")
*/

public class CollegeInfo {
	@Id
	@Column(name="Primary_key")
	
	@GeneratedValue(strategy=GenerationType.TABLE)
	int collegeId;
	@Column(name="college_name")
	String collegeName;
	public CollegeInfo(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	public CollegeInfo() {
		super();
		
	}
public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	

}
