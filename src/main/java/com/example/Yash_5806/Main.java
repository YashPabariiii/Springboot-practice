package com.example.Yash_5806;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        Staff nurse = context.getBean(Nurse.class);
        nurse.assist();
        Staff doctor1 = context.getBean(Doctor.class);
        doctor1.assist();
    }
}