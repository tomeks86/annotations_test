package edu.tseidler;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Examples {
    Example[] value() default {};
}
