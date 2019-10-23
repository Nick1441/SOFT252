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
public class Lecturer extends UniPeople implements ITeach{
    
    
    
    @Override
    public void setCourseWork(String Coursework){
        this.getStuCourse().setCourseWork(Coursework);
    }
    
    @Override
    public void teach(){
        String Output = getStuName() + " Is Teaching " + getStuCourse().getCourseCode() + " In Room " + getStuCourse().getCourseRoom();
        System.out.println(Output);
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
}
