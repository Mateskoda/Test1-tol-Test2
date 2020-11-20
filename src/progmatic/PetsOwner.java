package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PetsOwner {

    String name;
    int age;
    String sex;
    ArrayList<Integer> pets= new ArrayList<Integer>();
ArrayList<Pet> ownedPets = new ArrayList<>();

    public ArrayList<String> getOwnedPetNames() {
        return ownedPetNames;
    }

    ArrayList<String> ownedPetNames = new ArrayList<>();

    public void setOwnedPets(ArrayList<Pet> ownedPets) {
        this.ownedPets = ownedPets;
    }

    public ArrayList<Pet> getOwnedPets() {
        return ownedPets;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public ArrayList<Integer> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPets(ArrayList<Integer> pets) {
        this.pets = pets;
    }

    public PetsOwner ( ) throws FileNotFoundException {


    }}
