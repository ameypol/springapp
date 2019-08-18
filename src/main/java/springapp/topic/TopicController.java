package springapp.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicsservice;
	
	@RequestMapping("/topics")
	public List<Topic> getallTopic(){
		return topicsservice.getlist();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopica(@PathVariable String id){
		
		return topicsservice.getTopic(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicsservice.addTopic(topic); 	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicsservice.updateTopic(topic, id); 
	}
	
	@DeleteMapping(value ="/topics/{id}")
	//@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void updateTopic(@PathVariable String id) {
		topicsservice.deleteTopic(id); 
	}
}
