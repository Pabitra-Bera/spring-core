package com.madeeasy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        Doctor doctor = context.getBean("doctor", Doctor.class);
//        System.out.println("doctor.getQualification() = " + doctor.getQualification());
//        System.out.println("doctor.getDegree = " + doctor.getDegree());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Doctor doctor = context.getBean("doctor", Doctor.class);
        doctor.setDegree("MBBS");
        System.out.println("doctor.getDegree() = " + doctor.getDegree());
    }
}