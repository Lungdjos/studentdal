package com.lung.student.dal.studentdal.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "studenttab")
public class Student {
    // table attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String sname;
    private String scourse;
    private int sfee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScourse() {
        return scourse;
    }

    public void setScourse(String scourse) {
        this.scourse = scourse;
    }

    public int getSfee() {
        return sfee;
    }

    public void setSfee(int sfee) {
        this.sfee = sfee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", scourse='" + scourse + '\'' +
                ", sfee=" + sfee +
                '}';
    }
}
