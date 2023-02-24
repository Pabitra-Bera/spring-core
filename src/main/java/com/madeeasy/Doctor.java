package com.madeeasy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

    private Qualification qualification;

    public Doctor() {
        System.out.println("Donctor is instantiated");
    }

    public Doctor(Qualification qualification) {
        this.qualification = qualification;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public String getDegree(){
        return qualification.getDegree();
    }
    public void setDegree(String degree){
        qualification.setDegree(degree);
    }
}
