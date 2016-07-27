package com.kaishengit.pojo;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by D on 2016/7/27.
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 672461921714680372L;
    private Integer id;
    private String teaname;
    private Set<Student> studentSet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;

    }

/*    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teaname='" + teaname + '\'' +
                ", studentSet=" + studentSet +
                '}';
    }*/
}