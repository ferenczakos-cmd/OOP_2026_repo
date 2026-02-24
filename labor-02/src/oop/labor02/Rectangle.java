package oop.labor02;

public class Rectangle {
    private double width = 20;
    private double height = 10;

    public void createRectangle(double Width, double Height){
        if(Width>0){
            width = Width;
        }
        if(Height>0){
            height = Height;
        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

}
