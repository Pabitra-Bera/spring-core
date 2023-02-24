package com.madeeasy;

import org.springframework.stereotype.Component;

@Component
public class Qualification {
    private String degree;

    public Qualification() {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
}
