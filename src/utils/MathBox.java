package utils;

import java.util.Arrays;
import java.util.TreeSet;

public class MathBox extends ObjectBox<Number> {


    public MathBox(Number[] array) throws IllegalArgumentException {
        if(array == null) {
            throw new IllegalArgumentException("array can`t be null");
        }
        data = new TreeSet<>(Arrays.asList(array));

    }

    public Double summator() {
        return data.parallelStream().mapToDouble(Number::doubleValue).sum();
    }

    public double[] splitter(Double divider) throws ArithmeticException {
        if (divider == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return data.parallelStream().mapToDouble(number -> number.doubleValue() / divider).toArray();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MathBox mathBox = (MathBox) o;

        return data != null ? data.equals(mathBox.data) : mathBox.data == null;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "data=" + data +
                '}';
    }
}

