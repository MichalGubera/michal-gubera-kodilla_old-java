package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> listOfFigures = new ArrayList<Shape>();

    public int getListQuantity(){
        return listOfFigures.size();
    }

    public void addFigure(Shape shape){
        listOfFigures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (listOfFigures.contains(shape)){
            listOfFigures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape figure = null;
        if(listOfFigures.size() >= n) {
            figure = listOfFigures.get(n);
        }
        return figure;
    }

    public String showFigures(){
        String collection = "";
        for (Shape figure: listOfFigures){
            collection += figure;
        }
        return collection;
    }

}
