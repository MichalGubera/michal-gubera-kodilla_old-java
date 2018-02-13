package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String shapeName;
    private double field;

    public Square(double a) {
        this.shapeName = "Square";
        this.field = (a * a );
    }

    public String getShapeName() {
        return  shapeName;
    }

    public Double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "shape="+ shapeName + ", field=" + field + "; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }
}
