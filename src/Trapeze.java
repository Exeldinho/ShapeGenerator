public class Trapeze extends Shape {
    private double middleLine, height;

    Trapeze(String color, double middleLine, double height){
        setShapeColor(color);
        this.middleLine = middleLine;
        this.height = height;
    }

    public void draw(){
        System.out.println("Фігура: трапеція, площа: " + calcArea() +
                " кв. од., довжина середньої лінії: " + middleLine + " од., колір: " + getShapeColor());
    }

    public double getMiddleLine(){
        return middleLine;
    }

    public void setMiddleLine(double middleLine){
        this.middleLine = middleLine;
    }

    public double getHeight(){
        return height;
    }

    public void  setHeight(double height){
        this.height = height;
    }

    @Override
    public double calcArea(){
        return roundAvoid(middleLine*height);
    }

}
