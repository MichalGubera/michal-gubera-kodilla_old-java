package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String shapeName;
    private double field;

    public Triangle(double a, double h) {
        this.shapeName = "Triangle";
        this.field = (0.5 * a * h);
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
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }
}
