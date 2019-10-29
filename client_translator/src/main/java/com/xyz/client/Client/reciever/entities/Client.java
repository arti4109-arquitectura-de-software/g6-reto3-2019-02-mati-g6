package com.xyz.client.Client.reciever.entities;

public class Client {
    String name;
    String identification;
    String age;
    String gender;

    public Client(String name, String identification, String age, String gender) {
        super();
        this.name = name;
        this.identification = identification;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}