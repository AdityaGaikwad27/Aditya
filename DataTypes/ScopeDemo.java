package DataTypes;

public class ScopeDemo {
    //instance variable,gloable scope
    float pi = 3.14f;

    void circleArea() {
        int r = 10;
        float area = pi * r * r;
        System.out.println("area of circle is \t" + area);
    }

    public static void main(String[] args) {
        ScopeDemo sd = new ScopeDemo();
        sd.circleArea();
        //sd.area();

    }

    

}
