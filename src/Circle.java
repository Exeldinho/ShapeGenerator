public class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Фігура: коло, площа: " + calcArea() +
                " кв. од., радіус: " + radius +
                " од., колір: " + getColor());
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return roundAvoid(Math.PI*radius*radius);
    }

}