/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo.UniTracker;

/**
 *
 * @author ngclothier
 */
public class Admin {
    
    public static void assignCourse(Lecturer Lec, Course cour){
        Lec.setStuCourse(cour);
    }
    
    public static void assignCourse(Student stu, Course cour){
        stu.setStuCourse(cour);
    }
    
    public static void getDetails(Student Person){
        String Output = "Name = " + Person.getStuName() + ". ID = " + Person.getStuNum() + ". Course = " + Person.getStuCourse();
        System.out.println(Output);
    }
    
    public static void getDetails(Lecturer Person){
        String Output = "Name = " + Person.getStuName() + ". ID = " + Person.getStuNum() + ".";
        System.out.println(Output);
    }
}
