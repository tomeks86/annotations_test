package edu.tseidler;

import java.lang.reflect.Field;

public class AnnotationProcessor {
    public static void process() {
        Class cl = Main.class;
        for (Field f : cl.getFields()) {
            System.out.printf("%s: %s%n", f.getName(), f.getAnnotation(Example.class).id());
        }
    }
}
