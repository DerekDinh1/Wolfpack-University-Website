//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.banner.bannerApplication.entities;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Section{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long sectionNumber;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Rooms room;

    @ManyToOne
    private Professor professor;

    @OneToMany(mappedBy = "section")
    private Set<User> users = new HashSet<>();

    public Section() {}
    public Section(Course course, long sectionNumber){
        this.sectionNumber = sectionNumber;
        this.course = course;
    }
    public long getId () {
        return id;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public Professor getProfessor(){
        return professor;
    }
    public int getSectionNumber (int sectionNumber) {
        return sectionNumber;
    }

    public void setSectionNumber (long sectionNumber) {
       this.sectionNumber = sectionNumber;
    }
    public Course getCourse(){
        return course;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    public Rooms getRoom(){
        return room;
    }
    public void setRoom(Rooms room){
        this.room = room;
    }
}
