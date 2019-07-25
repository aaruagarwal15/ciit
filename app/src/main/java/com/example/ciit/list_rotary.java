package com.example.ciit;

public class list_rotary {
    private String Name;
    private String Contact_Number;
    private String Address;

    public list_rotary(String name, String contact_number, String address) {
        Name = name;
        Contact_Number = contact_number;
        Address = address;

    }

    public String getName() {

        return Name;
    }

    public String getContact_Number() {

        return Contact_Number;
    }

    public String getAddress() {

        return Address;
    }

}