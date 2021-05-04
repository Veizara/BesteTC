/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_1;

public class HW_1 {

    public static void main(String[] args) {

        Course course1 = new Course(1, "Physics");
        Course course2 = new Course(2, "Math");
        Course course3 = new Course(3, "Chemistry");

        Instructor intructor1 = new Instructor("Jake", " TMBI", 1);
        Instructor intructor2 = new Instructor("Sally", " Loli", 2);
        Instructor intructor3 = new Instructor("Midde", " Biezen", 3);

        CourseManager courseManager = new CourseManager();
        courseManager.whichTeacherWhichLesoon(course3, intructor3);
        courseManager.addingCourse(course3);
        courseManager.addingCourse(course2);
        courseManager.showAllTakingCourses();

    }

}
