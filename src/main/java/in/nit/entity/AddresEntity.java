package in.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "addrtab")
public class AddresEntity {
	@Id
	@GeneratedValue
	@Column(name = "addid")
   private Integer AddrId;
	@Column(name = "addrline1")
	private String addressLine1;
	@Column(name = "addrline2")
	private String addressLine2;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;

}
