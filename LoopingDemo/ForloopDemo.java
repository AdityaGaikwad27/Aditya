package LoopingDemo;

public class ForloopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.printf("The number %d is even\n", i);
            } else {
                System.out.printf("The number %d is odd\n", i);
            }
        }
    }
}
