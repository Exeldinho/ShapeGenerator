interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {
    abstract public double calcArea();
    private String shapeColor;

    public String getColor() {
        return shapeColor;
    }

    public void setColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public static double roundAvoid(double value) {
        if (value % 1 != 0 ){
            double scale = Math.pow(10, 1);
            return Math.round(value * scale) / scale;
        }
        return value;
    }
}