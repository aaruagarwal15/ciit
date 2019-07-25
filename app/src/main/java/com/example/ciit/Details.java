package com.example.ciit;

public class Details {
    private String hospital_name;
    private String region;

    public Details(String hospital_name, String region) {
        this.hospital_name = hospital_name;
        this.region = region;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public String getRegion() {
        return region;
    }
}
