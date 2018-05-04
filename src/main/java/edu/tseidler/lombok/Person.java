package edu.tseidler.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
}
