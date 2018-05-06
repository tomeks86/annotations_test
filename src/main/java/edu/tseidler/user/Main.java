package edu.tseidler.user;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Person janek = (new PersonBuilder())
                .setAge(15)
                .setName("janek")
                .setAddress("Jaśminowa 15, Frankfurt")
                .build();

        System.out.println(janek);

    }
}
