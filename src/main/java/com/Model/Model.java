package com.Model;

import java.util.Date;

public class Model {
    String NameOfEmployee;
    int Empoyee_id;
    long SalaryOfEmployee;
    Date JoiningDateOfEmployee;
    public static String BMW= "BMW";
    public static String Audi= "Audi";
    public static String Ferrari= "Ferrari";
    public static String Honda= "Honda";
    public static String Volkswagen= "Volkswagen";
    public static String Datsun= "Datsun";

    public Model(String nameOfEmployee, int empoyee_id, long salaryOfEmployee, Date joiningDateOfEmployee) {
        NameOfEmployee = nameOfEmployee;
        Empoyee_id = empoyee_id;
        SalaryOfEmployee = salaryOfEmployee;
        JoiningDateOfEmployee = joiningDateOfEmployee;
    }

    public String getNameOfEmployee() {
        return NameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        NameOfEmployee = nameOfEmployee;
        //System.out.println("Hello");
    }

    public int getEmpoyee_id() {
        return Empoyee_id;
        //System.out.println("Hello");
    }

    public void setEmpoyee_id(int empoyee_id) {
        Empoyee_id = empoyee_id;
        System.out.println("Hello");
    }

    public long getSalaryOfEmployee() {
        return SalaryOfEmployee;
        System.out.println("Hello");
    }

    public void setSalaryOfEmployee(long salaryOfEmployee) {
        SalaryOfEmployee = salaryOfEmployee;
        System.out.println("Hello");
    }

    public Date getJoiningDateOfEmployee() {
        return JoiningDateOfEmployee;
        System.out.println("Hello");
    }

    public void setJoiningDateOfEmployee(Date joiningDateOfEmployee) {
        JoiningDateOfEmployee = joiningDateOfEmployee;
    }
}
