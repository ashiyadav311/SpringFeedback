package com.bootjpamvcfeedback.bootjpamvcfeedback.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Feedback {
    @Id
    private int rollno;
    private String name;
    private String college;
    private String course;
    private String feed;


    public Feedback(int rollno, String name, String college, String course, String feed) {
        this.rollno = rollno;
        this.name = name;
        this.college = college;
        this.course = course;
        this.feed = feed;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public Feedback()
    {
        super();
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", feed='" + feed + '\'' +
                '}';
    }
}
