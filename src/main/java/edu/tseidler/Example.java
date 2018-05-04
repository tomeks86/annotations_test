package edu.tseidler;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Repeatable(value = Examples.class)
public @interface Example {
    String id() default "jerzyk (default)";
}
