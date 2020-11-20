package progmatic;

import java.util.ArrayList;

public class TinderUser {
    int num;
    String name;
    int age;
    String hair;
    String eye;
    String sex;
    ArrayList<String[]> likesAndDisLikes;
    ArrayList<String[]> gotLikes = new ArrayList<>();
    ArrayList<String[]> gotDisLikes = new ArrayList<>();
    ArrayList<String[]> givenLikes = new ArrayList<>();
    ArrayList<String[]> givenDisLikes = new ArrayList<>();
    public TinderUser(int num, String name, String sex, int age, String hair, String eye) {
        this.num = num;
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.hair = hair;
        this.eye = eye;
        String[] stringArray = {""};
        gotLikes.add(new String[]{""});
        gotDisLikes.add(stringArray);
        givenLikes.add(stringArray);
        givenDisLikes.add(stringArray);

    }

    public String getSex() {
        return sex;
    }

    public ArrayList<String[]> getGotLikes() {
        return gotLikes;
    }

    public ArrayList<String[]> getGotDisLikes() {
        return gotDisLikes;
    }

    public ArrayList<String[]> getGivenLikes() {
        return givenLikes;
    }

    public ArrayList<String[]> getGivenDisLikes() {
        return givenDisLikes;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHair() {
        return hair;
    }

    public String getEye() {
        return eye;
    }


    public enum HairColor {
        BROWN,
        RED,
        BLACK,
        BLONDE
    }

    public enum EyeColor {
        BLUE,
        BROWN,
        GREY,
        GREEN
    }

    public enum Sex {
        MALE,
        FEMALE
    }
}
