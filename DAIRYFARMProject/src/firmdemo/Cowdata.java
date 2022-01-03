/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmdemo;


/**
 *
 * @author SAYEM
 */
public class Cowdata {
    String stallno;
    String animaltype;
    String gender;
    String dob;
    double weight;
    double height;

    public Cowdata(String stallno, String animaltype, String gender, String dob, double weight, double height) {
        this.stallno = stallno;
        this.animaltype = animaltype;
        this.gender = gender;
        this.dob = dob;
        this.weight = weight;
        this.height = height;
    }

    public Cowdata() {
    }

    public String getStallno() {
        return stallno;
    }

    public void setStallno(String stallno) {
        this.stallno = stallno;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cowdata{" + "stallno=" + stallno + ", animaltype=" + animaltype + ", gender=" + gender + ", dob=" + dob + ", weight=" + weight + ", height=" + height + '}';
    }
    
}
