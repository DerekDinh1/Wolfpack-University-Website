//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.banner.bannerApplication.entities;
import javax.persistence.*;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalDateTime;

@Entity
public class Section{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long sectionNumber;

    private LocalDate startDate, endDate;
    private LocalTime startTime, endTime;
    private String classDate;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Rooms room;

    @ManyToOne
    private Professor professor;

    @ManyToOne
    private User user;


    public Section() {}
    public Section(Course course, Long sectionNumber){
        this.sectionNumber = sectionNumber;
        this.course = course;
    }
    public Long getId () {
        return id;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public Professor getProfessor(){
        return professor;
    }
    public User getUser() { return user;}

    public void setUser (User user) {
        this.user = user;
    }

    public Long getSectionNumber (Long sectionNumber) {
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
    public void setRoom(Rooms room){ this.room = room; }
    public void setStartDate (String startDate) throws ParseException {

        this.startDate = LocalDate.parse(startDate);
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setEndDate (String endDate) throws ParseException {
        this.endDate = LocalDate.parse(endDate);
    }
    public LocalDate getEndDate() { return endDate; }
    public void setStartTime (String startTime) {

        this.startTime = LocalTime.parse(startTime);
    }
    public LocalTime getStartTime() { return startTime; }
    public void setEndTIme (String endTime) { this.endTime = LocalTime.parse(endTime);}
    public LocalTime getEndTime() { return endTime; }
    public String getClassDate() { return classDate; }
    public void setClassDate (String classDate) { this.classDate = classDate;}
}
