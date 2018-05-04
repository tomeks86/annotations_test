package edu.tseidler;

import java.lang.reflect.Field;

public class AnnotationProcessor {
    public static void process() {
        Class cl = Main.class;
        for (Field f : cl.getFields()) {
            if (f.getAnnotation(Examples.class) != null) {
                for (Example example : f.getAnnotation(Examples.class).value()) {
                    System.out.printf("%s: %s%n", f.getName(), example.id());
                }
            } else {
                System.out.printf("%s: %s%n", f.getName(), f.getAnnotation(Example.class).id());
            }
        }
    }
}
