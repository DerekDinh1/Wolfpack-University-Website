package com.banner.bannerApplication.entities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;

/** This is the test class for Section objects */

public class SectionTest {

    private Professor professor;
    private Course course;
    private Section section;
    private Rooms room;


    /** performs our initial set up of our Section object */
    @Before
    public void setUp(){
        professor = new Professor();
        course = new Course();
        section = new Section();
        course.setCourseName("CS3250");
        section.setProfessor(professor);
        section.setCourse(course);
        section.setSectionNumber(1);
    }

    @Test
    public void getSectionNumber() throws Exception{
        assertEquals(1, (long) section.getSectionNumber());
    }

    @Test
    public void setSectionNumber() throws Exception{
        Section section = new Section();
        section.setSectionNumber(1);
        assertEquals(1, (long)section.getSectionNumber());
    }

    /** Make sure we can access the Section objects course name */
    @Test
    public void getCourseName()throws Exception {
        assertEquals("CS3250",course.getCourseName());
    }

    /** Make sure we can set/change the courses name */
    @Test
    public void setCourseName() throws Exception{
        course.setCourseName("CS1050");
        assertEquals("CS1050",course.getCourseName());
    }

    @Test
    public void setRoom() throws Exception{
        Rooms room = new Rooms();
        section.setRoom(room);
        assertSame(room, section.getRoom());
    }

    @Test
    public void getRoom() throws Exception{
        assertSame(room, section.getRoom());
    }

    @Test
    public void setCourse() throws Exception{
        Course course = new Course();
        section.setCourse(course);
        assertSame(course, section.getCourse());
    }

    @Test
    public void getCourse() throws Exception{
        assertSame(course, section.getCourse());
    }

    @Test
    public void setProfessor() throws Exception{
        Professor professor = new Professor();
        section.setProfessor(professor);
        assertSame(professor, section.getProfessor());
    }

    @Test
    public void getProfessor() throws Exception{
        assertSame(professor, section.getProfessor());
    }
}
