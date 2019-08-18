package springapp.topic;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicrepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "spring famework", "descrip"),
//			new Topic("java", "corejava", "descrip"),
//			new Topic("javascript", "javascript tout", "descrip")
//			));
	
	public List<Topic> getlist() {
		//return topics;
		List<Topic> t =new ArrayList<>();
		
		topicrepository.findAll().forEach(t::add);
	return t;
	}
	
	
	public Topic getTopic(String id) {
	   return topicrepository.findById(id).get();
	//	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addTopic(Topic topic)
	{
	//	topics.add(topic);
		topicrepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < topics.size();) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//			topics.set(i, topic);
//			return;
//		}
		topicrepository.save(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
	//topics.removeIf(t -> t.getId().equals(id));
		topicrepository.deleteById(id);
	}
	
}
