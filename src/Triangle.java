public class Triangle extends Shape{
    private double baseWidth, height;

    Triangle(String color, double baseWidth, double height){
        setShapeColor(color);
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public void draw(){
        System.out.println("Фігура: трикутник, площа: " + calcArea() +
                " кв. од., гіпотенуза: " + baseWidth + " од., колір: " + getShapeColor());
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

    @Override
    public double calcArea(){
        return roundAvoid((baseWidth*height)/2);
    }

}
