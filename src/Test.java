public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Triangle triangle1 = new Triangle(2,3,4);
        System.out.println(triangle1);
        Shape triangle2 = new Triangle();
        System.out.println(triangle2);
    }
}
