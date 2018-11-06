package com.company;

public class Student {
    private String name;
    private int age;
    private Address address;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getState() {
        return this.getAddress().getState();
    }

    public String getStreetAddress() {
        return address.getStreetAddress();
    }

    public void setStreetAddress(String streetAddress) {
        this.address.setStreetAddress(streetAddress);
    }

    public int getZipCode() {
        return this.address.getZipCode();
    }

    public void setZipCode(int zipCode) {
        this.address.setZipCode(zipCode);
    }

    public void setState(String state) {
        this.address.setState(state);
    }

    public String getPhone() {
        return this.address.getPhone();

    }

    public void setPhone(String phone) {
        this.address.setPhone(phone);
    }
}
