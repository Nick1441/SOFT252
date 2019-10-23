package unidemo;

import unidemo.UniTracker.*;

/**
 *
 * @author ngclothier
 */
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lecturer NewLec = new Lecturer(100, "Chris");
        Student NewStu = new Student(001, "Nick");
        Course NewCour = new Course("BGB106", "4321");
        
        Admin.getDetails(NewStu);
        
        Admin.assignCourse(NewLec, NewCour);
        Admin.assignCourse(NewStu, NewCour);
        
        NewStu.attendClass();
        NewLec.teach();
        
        NewStu.doCoursework();
        
        NewLec.setCourseWork("Boring Coursework");
        
        NewStu.doCoursework();
        
        Admin.getDetails(NewLec);
    }
    
}
