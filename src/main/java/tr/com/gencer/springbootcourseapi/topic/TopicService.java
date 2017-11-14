package tr.com.gencer.springbootcourseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> allTopics = new ArrayList<>(Arrays.asList(
        new Topic("spring", "Spring Course", "Spring Description"),
        new Topic("java", "Java Course", "Java Description"),
        new Topic("javascript", "JavaScript Course", "JavaScript Description")));


    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}