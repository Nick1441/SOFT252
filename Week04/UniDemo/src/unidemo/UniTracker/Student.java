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
public class Student extends UniPeople{
    
    public Student(int id, String name){
        super(id, name);
    }
    
    public void attendClass(){
        String Output = getStuName() + " Is Attending " + getStuCourse().getCourseCode() + " In Room " + getStuCourse().getCourseRoom();
        System.out.println(Output);
    }
    
    public void doCoursework(){
        String Output2 = getStuName() + " Is Doing coursework " + getStuCourse().getCourseWork();
        System.out.println(Output2);
    }
}
