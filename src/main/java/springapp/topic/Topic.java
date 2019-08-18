package springapp.topic;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String desccription;
	
	public Topic( String id, String name, String desccription) {
		super();
		this.id = id;
		this.name = name;
		this.desccription = desccription;
	}
	public Topic() {
		// super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesccription() {
		return desccription;
	}
	public void setDesccription(String desccription) {
		this.desccription = desccription;
	}
	
	
	
}
