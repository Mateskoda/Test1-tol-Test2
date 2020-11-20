package progmatic;

public class CsaládfaPerson {
    static int code = 0;
    String name;
    CsaládfaPerson father;
    CsaládfaPerson mother;

    public void setFather(CsaládfaPerson father) {
        this.father = father;
    }

    public void setMother(CsaládfaPerson mother) {
        this.mother = mother;
    }

    String fathersName="?";
    String mothersName="?";

    public CsaládfaPerson(String name, String mothersName,String fathersName) {
        code++;
        this.name = name;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
    }

    public static int getCode() {
        return code;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getName() {
        return name;
    }
}
