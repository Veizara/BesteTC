
package hw_1;

import java.util.ArrayList;


public class CourseManager {
    
    ArrayList<Course> allTakingCourses = new ArrayList<Course>();
    
    public void whichTeacherWhichLesoon(Course courses, Instructor instructor) {
        
       System.out.println(instructor.Name + " " + instructor.Lastname + " gives " +
                courses.courseName + " lesson."); 
        
    }
  
    public void addingCourse(Course coursess) {
        this.allTakingCourses.add(coursess);
        System.out.println("You add " + coursess.courseName + " lesson");
    }

    public void showAllTakingCourses() {
        System.out.println("You are taking ");
        for (int i = 0; i < this.allTakingCourses.size() ; i++) {
            System.out.println(this.allTakingCourses.get(i).GetcourseName());        
        }
    
    }
    
}
