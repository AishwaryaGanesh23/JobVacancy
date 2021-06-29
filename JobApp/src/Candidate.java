


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity 
@Table(name = "Candidate")
public class Candidate{
	
	//@Id - primary key
	@Id 
	@GeneratedValue
	private int candidate_id;

	@Column(name="name", nullable = false)
	private String candidate_name;
	
	@Column(name="points", nullable = false)
	private Integer candidate_points;
	
	
	//getters and setters
	public String getCandidate_name() {
		return candidate_name;
	}
	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}
	
	public Integer getCandidate_points() {
		return candidate_points;
	}
	public void setCandidate_points(Integer candidate_points) {
		this.candidate_points = candidate_points;
	}
	
	
	
}
