package com.example.Yash_5806;

public class Doctor implements Staff {
    private String qualification;
    private Nurse nurse;

    public Doctor(String qualification){
        this.qualification=qualification;
    }
public void assist(){
    System.out.println("Doctor is assisitng");
}

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}