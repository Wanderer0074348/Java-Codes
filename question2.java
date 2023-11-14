
interface Drawable {
  void draw();
}

class Circle implements Drawable {
public void draw() {
    System.out.println("  * *  ");
    System.out.println("*     *");
    System.out.println("*     *");
    System.out.println("  * *  ");

}
}

class Rectangle implements Drawable {
public void draw() {
    int width = 10;
    int height = 5;
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}

class Triangle implements Drawable {
    public void draw() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class question1{
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        System.out.println("\n");
        d1.draw();
        Drawable d2 = new Rectangle();
        d2.draw();
        System.out.println("\n");
        Drawable d3 = new Triangle();
        d3.draw();
        System.out.println("\n");
    }
}
