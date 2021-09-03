public class Triangle extends Shape{
    private double baseWidth, height;

    Triangle(String color, double baseWidth, double height){
        setColor(color);
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public void draw(){
        System.out.println("Фігура: трикутник, площа: " + calcArea() +
                " кв. од., гіпотенуза: " + baseWidth +
                " од., колір: " + getColor());
    }

    public double getBaseWidth(){
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth){
        this.baseWidth = baseWidth;
    }

    public double getHeight(){
        return height;
    }

    public void  setHeight(double height){
        this.height = height;
    }

    public double calcArea(){
        return roundAvoid((baseWidth*height)/2);
    }

}
