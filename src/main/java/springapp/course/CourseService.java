package springapp.course;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courserepository;
	
//	private List<Course> topics = new ArrayList<>(Arrays.asList(new Course("spring", "spring famework", "descrip"),
//			new Course("java", "corejava", "descrip"),
//			new Course("javascript", "javascript tout", "descrip")
//			));
	
	public List<Course> getlist(String topicId) {
		//return topics;
		List<Course> t =new ArrayList<>();
		courserepository.findByTopicId(topicId).forEach(t::add);
	return t;
	}
	
	
	public Course getCourse(String id) {
	   return courserepository.findById(id).get();
	//	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addCourse(Course course)
	{
	//	topics.add(topic);
		courserepository.save(course);
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < topics.size();) {
//			Course t = topics.get(i);
//			if(t.getId().equals(id))
//			topics.set(i, topic);
//			return;
//		}
		courserepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
	//topics.removeIf(t -> t.getId().equals(id));
		courserepository.deleteById(id);
	}
	
}
