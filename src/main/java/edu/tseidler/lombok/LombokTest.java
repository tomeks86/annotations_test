package edu.tseidler.lombok;

public class LombokTest {

    public static void main(String[] args) {
        Person p1 = new Person("franek", "śmietana", 15, 0.);
        System.out.println(p1);

        Person p2 = Person.builder()
                .firstName("josif")
                .lastName("stawski")
                .age(50)
                .salary(1500)
                .build();
        System.out.println(p2);
    }
}
