package springapp.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springapp.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getallCousre(@PathVariable String id){
		return courseservice.getlist(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id){
		
		return courseservice.getCourse(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses/{id}")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.addCourse(course); 	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.updateCourse(course); 
	}
	
	@DeleteMapping(value ="/topics/{topicId}/courses/{id}")
	//@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseservice.deleteCourse(id); 
	}
}
