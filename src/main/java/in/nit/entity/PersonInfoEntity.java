package in.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class PersonInfoEntity {
	@Id
	@GeneratedValue
	@Column(name = "pid")
	private Integer pId;
	@Column(name = "fname")
	private String firstName;
  @Column(name = "lname")
	private String lastName;
	@Column(name = "dob")
	private String dob;
	@Column(name = "gender")
	private String gender;


}
