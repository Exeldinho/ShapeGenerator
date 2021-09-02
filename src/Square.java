public class Square extends Shape {
    private double side;

    Square(String color, double side){
        setShapeColor(color);
        this.side = side;
    }

    public void draw(){
        System.out.println("Фігура: квадрат, площа: " + calcArea() +
                " кв. од., довжина сторони: " + side + " од., колір: " + getShapeColor());
    }

    public double getSide(){
        return side;
    }

    public void setSide(double width){
        this.side = width;
    }

    @Override
    public double calcArea(){
        return roundAvoid(side*side);
    }

}
