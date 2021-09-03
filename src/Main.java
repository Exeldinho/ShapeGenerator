public class Main {
    public static void main(String[] args) {
        {
            int random = (int) (Math.random() * 100);

            ShapeGenerator shapeGenerator = new ShapeGenerator(random);
            for (Shape s : shapeGenerator)
                s.draw();
        }
    }
}