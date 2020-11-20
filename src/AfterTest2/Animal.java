package AfterTest2;

public abstract class Animal {
    String name;
    String type;
    String area;
    int age;
    String voice;

    public abstract void voice();

    public Animal(String name, String type, String area, int age) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
