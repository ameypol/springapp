package springapp.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import springapp.topic.Topic;


@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String desccription;
	
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Course( String id, String name, String desccription, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.desccription = desccription;
		this.topic= new Topic(topicId,"","");
	}
	public Course() {
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
