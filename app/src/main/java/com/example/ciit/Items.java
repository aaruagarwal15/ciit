package com.example.ciit;

public class Items {
    private String Name;
    private String Title;
    private String Status;

    public Items(String name, String title, String status) {
        Name = name;
        Title = title;
        Status = status;

    }

    public String getName() {

        return Name;
    }

    public String getTitle() {

        return Title;
    }

    public String getStatus() {

        return Status;
    }

}