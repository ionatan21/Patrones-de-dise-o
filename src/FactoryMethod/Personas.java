/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author barri
 */
public class Personas {
     private String firstName;     
    private String Surname;
    private String secondSurname;
    private String exactAddress;
    private String secondPhoneNumber;
    private String CivilStatus;
    private String PlaceOfBirth;
    private String sex ;
    private String idNunber;
    private int Age;
    private String MayoMen;

    public String getMayoMen() {
        return MayoMen;
    }

    public void setMayoMen(String MayoMen) {
        this.MayoMen = MayoMen;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getCivilStatus() {
        return CivilStatus;
    }

    public void setCivilStatus(String CivilStatus) {
        this.CivilStatus = CivilStatus;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(String PlaceOfBirth) {
        this.PlaceOfBirth = PlaceOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNunber() {
        return idNunber;
    }

    public void setIdNunber(String idNunber) {
        this.idNunber = idNunber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
public abstract String Comprobacion();
     
    
}
