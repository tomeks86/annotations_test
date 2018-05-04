package edu.tseidler.runtime;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ClassWithAnnotatedFields {

    @SourceTest
    public static int noAnnotationAfterCompilation;

    @ClassTest
    @SuppressWarnings("abc")
    public static int availableWhenDecompiled;

    @RuntimeTest
    @Deprecated
    public static int availableAtRuntime;

    public static void main(String[] args) {
        Class cl = ClassWithAnnotatedFields.class;
        for (Field field : cl.getFields()) {
            Annotation[] annotations = field.getAnnotations();
            if (annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    System.out.printf("field: %s, annotation: %s%n", field.getName(), annotation.toString());
                }
            }
        }
    }
}
