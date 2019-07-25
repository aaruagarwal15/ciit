package com.example.ciit;

public class Patients_details {
    private String Name,title,hospital,diagnosis,date,photos;

    public Patients_details(String name, String title, String hospital, String diagnosis, String date, String photos) {
        Name = name;
        this.title = title;
        this.hospital = hospital;
        this.diagnosis = diagnosis;
        this.date = date;
        this.photos = photos;
    }

    public String getName() {
        return Name;
    }

    public String getTitle() {
        return title;
    }

    public String getHospital() {
        return hospital;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDate() {
        return date;
    }

    public String getPhotos() {
        return photos;
    }
}
