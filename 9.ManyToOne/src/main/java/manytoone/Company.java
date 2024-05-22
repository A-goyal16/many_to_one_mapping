package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company
{
	@Id
	int id;
	String name;
	String ceoname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeoname() {
		return ceoname;
	}
	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}
}
