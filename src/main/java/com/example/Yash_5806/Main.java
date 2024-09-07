package com.example.Yash_5806;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        Nurse nurse = (Nurse) context.getBean("nurse");
//        here we have type-casted the value coz it will recieve the data in the form of object i.e nurse.
        nurse.assist();
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
        Staff staff2 = context.getBean(Nurse.class);
        staff2.assist();
    }
}