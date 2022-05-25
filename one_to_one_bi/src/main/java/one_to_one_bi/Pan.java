package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Pan {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private int pannumber;

	@OneToOne
	@JoinColumn
	Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPannumber() {
		return pannumber;
	}

	public void setPannumber(int pannumber) {
		this.pannumber = pannumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
