package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pet {
    String name;
    String type;
    int age;
    int petCode;
    String petsOwner;

    public Pet() throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("pets.txt"));
//        for (int i = 0; sc.hasNext(); i++) {
//            String line = sc.nextLine();
//            String[] parts = line.split(",");
//            petCode = Integer.parseInt(parts[0]);
//            name = parts[1];
//            type = parts[2];{
}
//            age = Integer.parseInt(parts[3]);
//        }
//        sc = new Scanner(new File("petsowner.txt"));


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPetCode(int petCode) {
        this.petCode = petCode;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getPetCode() {
        return petCode;
    }

    public String getPetsOwner() {
        return petsOwner;
    }

    public void setPetsOwner(String petsOwner) {
        this.petsOwner = petsOwner;
    }
}
