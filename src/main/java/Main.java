
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3,5);
        System.out.println(triangle.toString());
        System.out.println("Triangle area = " + triangle.calculateGeronArea());
        System.out.println("Triangle perimeter = " + triangle.calculatePerimeter());
        System.out.println("Triangle is isosceles: " + triangle.isIsosceles());
        System.out.println("Triangle is equilateral: " + triangle.isEquilateral());


    }


}