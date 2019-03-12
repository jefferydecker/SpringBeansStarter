package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	private Address address;
	
	public Contact( ) {
		super();
		this.relationship = "spouse";
	}

	public Contact(String name) {
		super();
		this.name = name;
	}

	public Contact(String name, String phone, String relationship) {
		super();
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}

	public Contact(int id, String name, String phone, String relationship) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}

//	public Contact(int id, String name, String phone, String relationship, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.phone = phone;
//		this.relationship = relationship;
//		this.address.setCity(address.getCity());
//		this.address.setState(address.getState());
//		this.address.setStreet(address.getStreet());
//	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address.setStreet(address.getStreet());
		this.address.setCity(address.getCity());
		this.address.setState(address.getState());
	}

	@Override
	public String toString() {
		return "Contact [id = “ + id + “, name=" + name + ", phone=" + phone + ", relationship=" + relationship + ", " + address.toString() + "]";
	}
}
