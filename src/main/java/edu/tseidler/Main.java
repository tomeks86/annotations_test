package edu.tseidler;

public class Main {
    @Example(id = "franek")
    public int x;

    @Example(id = "stefan")
    public static int y;

    @Example public static int z;

    public static void main(String[] args) {
        AnnotationProcessor.process();
    }
}
