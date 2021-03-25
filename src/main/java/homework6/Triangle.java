package homework6;

public class Triangle {

    private int a;
    private int b;
    private int c;
    private static Triangle instance;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int setA(int a) {
        this.a = a;
        return a;
    }

    public int setB(int b) {
        this.b = b;
        return b;
    }

    public int setC(int c) {
        this.c = c;
        return c;
    }

    public int calculatePerimeter (){
        return  a + b + c;
    }

    public static synchronized Triangle getInstance() {
        if (instance == null) {
            instance = new Triangle();
        }
        return instance;
    }

}
