package io.javabrains.utils;
import java.util.*;

public class Main {
    public static void Main() {
        MathUtils mathUtils = new MathUtils();
        CricketScorer cs = new CricketScorer();
        cs.six();
        System.out.println(cs.getScore());

        System.out.println(mathUtils.multiply(2, 4));

    }
}
