package com.example.Yash_5806;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

 @Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;
public void assist(){
    System.out.println("Doctor is assisitng");
}

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName class is called");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Constructor is called");
    }
}
