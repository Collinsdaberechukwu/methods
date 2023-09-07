package org.example;

public class Methodsss {
    private String name;
    private  String number;
    
    
    public  Methodsss(String name, String number){
        this.name = name;
        this.number = number;

        System.out.println(this.name+ " Is a student of Decagon");
        System.out.println("Number of admitted student is : " + this.number );
    }
    public Methodsss(){}
    
    public void setName(){
        return;
    }
    public void getName(){
        return;
    }
    public void setNumber(){
        return;
    }
    public void getNumber(){
        return;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

