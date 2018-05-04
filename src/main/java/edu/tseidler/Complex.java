package edu.tseidler;

import java.util.Objects;

public class Complex {
    private final int real;
    private final int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return real == complex.real &&
                imag == complex.imag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
}
