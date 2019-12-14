package eboll;

import java.lang.*;
public class testball {
    public static void main(String[] args) {
        ball b1 = new ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
