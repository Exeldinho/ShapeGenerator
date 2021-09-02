import java.util.Iterator;
import java.util.Random;

public class ShapeGenerator implements Iterable<Shape> {
    private Random random = new Random();
    private Shape make() {

        String[] shapeColor = {"червоний", "білий", "зелений", "синій", "фіолетовий", "рожевий" , "чорний"};

        double randomBaseNumb = Math.random()*10+1.27;
        int randomNumb = random.nextInt((int)randomBaseNumb) + 8;
        int randomNumb2 = random.nextInt(randomNumb) + 8;
        int index = random.nextInt(shapeColor.length);

        switch (random.nextInt(4)) {
            default:
            case 0:
                return new Circle(shapeColor[index], randomNumb);
            case 1:
                return new Square(shapeColor[index], randomNumb);
            case 2:
                return new Triangle(shapeColor[index], randomNumb, randomNumb2);
            case 3:
                return new Trapeze(shapeColor[index], randomNumb, randomNumb2);
        }
    }

    private Shape[] arrOfShapes;

    ShapeGenerator(int value) {
        arrOfShapes = new Shape[value];
        for (int i = 0; i < value; i++)
            arrOfShapes[i] = make();

    }

    public Iterator<Shape> iterator() {
        return new Iterator<>() {
            private int index = 0;

            public boolean hasNext() {
                return index < arrOfShapes.length;
            }

            public Shape next() {
                return arrOfShapes[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }



}