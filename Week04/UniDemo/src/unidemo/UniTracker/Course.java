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
public class Course {
    private String CourseCode = "UNKNOWN";
    private String CourseWork = "UNKNOWN";
    private String CourseRoom = "UNKOWN";
    private Lecturer CourseLec;

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseWork() {
        return CourseWork;
    }

    public void setCourseWork(String CourseWork) {
        this.CourseWork = CourseWork;
    }

    public String getCourseRoom() {
        return CourseRoom;
    }

    public void setCourseRoom(String CourseRoom) {
        this.CourseRoom = CourseRoom;
    }

    public Lecturer getCourseLec() {
        return CourseLec;
    }

    public void setCourseLec(Lecturer CourseLec) {
        this.CourseLec = CourseLec;
    }

    public Course(String Room, String Code) {
        CourseCode = Code;
        CourseRoom = Room;
    }
    
    
}
