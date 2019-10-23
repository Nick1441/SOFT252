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
public abstract class UniPeople {
    private Course StuCourse;
    private Integer StuNum = 0;
    private String StuName = "UNKNOWN";

    public Integer getStuNum() {
        return StuNum;
    }

    public void setStuNum(Integer StuNum) {
        this.StuNum = StuNum;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public Course getStuCourse() {
        return StuCourse;
    }

    public void setStuCourse(Course StuCourse) {
        this.StuCourse = StuCourse;
    }

    public UniPeople(int id, String name){
        StuName = name;
        StuNum = id;
    }
}
