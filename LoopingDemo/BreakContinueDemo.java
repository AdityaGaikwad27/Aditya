package LoopingDemo;

public class BreakContinueDemo {
    public static void main(String[] args) {
        int i;
        // for loop with break
        System.out.println("for loop with break");
        for (i = 1; i <= 20; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("while loop with continue");
        // While loop with continue

        for (i = 1; i <= 20; i++) {
            if (i == 5)
                continue;
            System.out.println(i);

        }

    }
}
