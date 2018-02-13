package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private String shapeName;
    private double field;

    public Circle(double r) {
        this.shapeName = "Circle";
        this.field = (3.14 * r);
    }

    public String getShapeName() {
        return shapeName;
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
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }
}
