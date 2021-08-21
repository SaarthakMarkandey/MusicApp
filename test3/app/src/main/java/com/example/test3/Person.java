package com.example.test3;

public class Person {

    String personName;
    int personImage;
    public Person(String songName,int songImage){
        this.personImage=songImage;
        this.personName=songName;
    }
    public String getPersonName(){
        return personName;
    }

    public int getPersonImage(){
        return personImage;
    }
}
