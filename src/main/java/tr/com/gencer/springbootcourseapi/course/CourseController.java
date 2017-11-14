package tr.com.gencer.springbootcourseapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO: Course API should be implemented.
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return null; //courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String topicid, @PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/{id}")
    public void addCourse(@PathVariable String topicId, @RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        courseService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void removeCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
