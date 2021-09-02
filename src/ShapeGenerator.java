import java.util.Iterator;
import java.util.Random;
import java.security.SecureRandom;

public class ShapeGenerator implements Iterable<Shape> {
    private Shape make() {
        String[] shapeColor = {
                "червоний",
                "білий",
                "зелений",
                "синій",
                "фіолетовий",
                "рожевий" ,
                "чорний"};

        Random random = new Random();
        SecureRandom secureRandom = new SecureRandom();

        int index = random.nextInt(shapeColor.length);

        double randomBaseNumb = Math.random()*100+1.27;
        int randomNumb = secureRandom.nextInt((int)(randomBaseNumb)) + 8;
        int randomNextNumb = random.nextInt(randomNumb) + 8;

        switch (random.nextInt(4)) {
            default:
            case 0:
                return new Circle(shapeColor[index], randomNumb);
            case 1:
                return new Square(shapeColor[index], randomNumb);
            case 2:
                return new Triangle(shapeColor[index], randomNumb, randomNextNumb);
            case 3:
                return new Trapeze(shapeColor[index], randomNumb, randomNextNumb);
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