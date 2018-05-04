package edu.tseidler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationProcessor {
    public static void process() {
        Class cl = Main.class;
        for (Field f : cl.getFields()) {
            Annotation[] annotations;
            if ((annotations = f.getAnnotationsByType(Example.class)) != null) {
                for (Annotation annotation : annotations) {
                    System.out.printf("%s: %s%n", f.getName(), ((Example) annotation).id());
                }
            }
        }
    }
}
