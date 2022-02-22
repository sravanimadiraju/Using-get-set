package com.company;

public class Main {

    public static void main(String[] args) {
     Student m1= new Student(" Sayana ",13,95,95.8);
     System.out.println(m1.getName());
        System.out.println(m1.getRoolnumber());
        System.out.println(m1.getResult());
        System.out.println(m1.getModulus());
        Student m2= new Student(" Goutham ", 10,95,95.7);
        System.out.println(m2.getName());
        System.out.println(m2.getRoolnumber());
        System.out.println(m2.getResult());
        System.out.println(m2.getModulus());
    }
}

class Student{
    private String name;
    private int roolnumber;
    private int result;
    private double modulus;

    public Student(String name, int roolnumber, int result, double modulus) {
        this.name = name;
        this.roolnumber = roolnumber;
        this.result = result;
        this.modulus = modulus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoolnumber() {
        return roolnumber;
    }

    public void setRoolnumber(int roolnumber) {
        this.roolnumber = roolnumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public double getModulus() {
        return modulus;
    }

    public void setModulus(double modulus) {
        this.modulus = modulus;
    }
}