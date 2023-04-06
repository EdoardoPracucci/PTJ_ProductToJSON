package Model;

public class ClassToTest {
    private int a;
    private int b;

    private String c;
    private String d;

    public ClassToTest() {
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
    }

    public ClassToTest(int a, int b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
