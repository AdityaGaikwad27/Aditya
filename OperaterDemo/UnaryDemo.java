package OperaterDemo;

public class UnaryDemo {
    public static void main(String[] args) {
        int a=10;
        //prefix increment
        System.out.println("org a value is\t"+a);
        System.out.println("after pre increment a value is\t"+(++a));
        System.out.println("updated value of a is\t"+a);

        //postfix increment
        int b=10;
        System.out.println("org value of b is \t"+b);
        System.out.println("after post inc b is \t"+(b++));
        System.out.println("updated value is \t"+b);
        System.out.println("____________________________");  
        //sepration 

        int c=10;
        //prefix deccrement
        System.out.println("org c value is\t"+c);
        System.out.println("after pre dec c value is\t"+(--c));
        System.out.println("updated value of c is\t"+c);

        //postfix decrement
        int d=10;
        System.out.println("org value of d is \t"+d);
        System.out.println("after post dec d is \t"+(d--));
        System.out.println("updated value is \t"+d);
        

    }
}
