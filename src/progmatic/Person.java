package progmatic;

import java.util.ArrayList;
import java.util.Objects;

public class Person {
String name;
int age;
int weight;
    int height;
    ArrayList <Person> array1;


    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
                ArrayList <Person> array1=new ArrayList<Person>();
            }

public int minimumWeight(){
        int min = Integer.MAX_VALUE;
    for (int i = 0; i <array1.size() ; i++) {
        if (array1.get(i).weight<min)
        {
            min = array1.get(i).weight;
        }
    }return min;

}

    public int sumOfHeight() {
        int sum = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum += array1.get(i).height;

        }
        return sum;
    }
    public double avgOfAges() {
        int sum = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum += array1.get(i).age;

        }
        return (double)sum/array1.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<Person> getArray1() {
        return array1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
