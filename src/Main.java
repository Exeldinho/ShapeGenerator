public class Main {
    public static void main(String[] args) {
        {
            int rand = (int) (Math.random() * 100);

            ShapeGenerator sh = new ShapeGenerator(rand);
            for (Shape s : sh)
                s.draw();
        }
    }
}