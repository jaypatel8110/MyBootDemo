package com.j.mybootdemo.models;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    List<Student> studentsList;

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<Student> getStudentList() {
        if(studentsList==null){
            studentsList=new ArrayList<>();
        }
        return studentsList;
    }
}
