
package hw_1;




public class Course {
    
        int ID;
        String courseName;
    

    public Course(int ID, String courseName) {
        
        this.ID = ID;
        this.courseName = courseName;
        
    }
    
    public int GetID() {
    return ID;
}
    public void SetID(int ID){
        this.ID = ID;
    }
   
    public String GetcourseName() {
        return this.courseName;
    }

    public void SetCourseName(String courseName) {
       this.courseName = courseName;
    }
}
