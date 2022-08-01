import java.util.Objects;

public class Triangle {

    double side1;
    double side2;
    double base;


    public Triangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public double calculatePerimeter() {
        return this.getSide1() + this.getSide2() + this.getBase();
    }

    public double calculateHalfPerimeter() {
        return (this.getSide1() + this.getSide2() + this.getBase()) / 2;
    }

    public double calculateGeronArea() {
        return Math.sqrt(
                this.calculateHalfPerimeter()
                        * (this.calculateHalfPerimeter() - this.getSide1())
                        * (this.calculateHalfPerimeter() - this.getSide2())
                        * (this.calculateHalfPerimeter() - this.getBase()));
    }

    public boolean isIsosceles() {
        return this.side1 == this.side2;
    }

    public boolean isEquilateral() {
        return this.isIsosceles() && this.base == this.side1;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", base=" + base +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.base, base) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, base);
    }
}
