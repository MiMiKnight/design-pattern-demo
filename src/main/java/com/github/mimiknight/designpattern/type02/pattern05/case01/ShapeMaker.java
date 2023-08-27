package com.github.mimiknight.designpattern.type02.pattern05.case01;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        this.circle = (Shape) new Circle();
        this.rectangle = (Shape) new Rectangle();
        this.square = (Shape) new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
