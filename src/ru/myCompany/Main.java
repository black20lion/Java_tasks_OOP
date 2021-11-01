package ru.myCompany;

import ru.myCompany.My.MyPoint;
import ru.myCompany.My.MyTriangle;
import ru.myCompany.book.Author;
import ru.myCompany.book.Book;
import ru.myCompany.employee.Employee;
import ru.myCompany.figures.Circle;
import ru.myCompany.figures.Rectangle;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.setColor("blue");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5.0f);
        rectangle1.setWidth(6.0f);

        System.out.println(circle1.getColor());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getClass());
        System.out.println(circle1);

        System.out.println("===================");

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getClass());
        System.out.println(rectangle1);

        System.out.println("===================");

        Employee employee1 = new Employee(0001, "John", "Smith", 567);
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee1.getName());
        System.out.println(employee1.getId());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.raiseSalary(5));
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee1);

        System.out.println("===================");

        Author[] authors1 = {new Author("Mikel Jackson", "MK@gmail.com", 'm'),
                new Author("Angelina Jolie", "AJ@gmail.com", 'f'),
                new Author("Elon Musk", "EM@gmail.com", 'm')};

        Book book1 = new Book("How to earn a million", authors1, 999.99, 5000);

        System.out.println(book1.getName());
        System.out.println(Arrays.toString(book1.getAuthors()));
        System.out.println(book1.getPrice());
        System.out.println(book1.getQty());
        System.out.println(book1.getClass());
        System.out.println(book1.getAuthorNames());

        book1.setPrice(799.99);
        System.out.println(book1.getPrice());

        book1.setQty(3000);
        System.out.println(book1.getQty());

        System.out.println("===================");

        MyPoint point1 = new MyPoint(5, 10);
        MyPoint point2 = new MyPoint(-20, -7);
        MyPoint point3 = new MyPoint();
        System.out.println(point1);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        System.out.println(Arrays.toString(point1.getXY()));

        System.out.println(point1.distance(point2));
        System.out.println(point1.distance());
        System.out.println(point1.distance(7, -9));

        point1.setXY(-6, -12);
        System.out.println(point1.distance());

        System.out.println("===================");

        MyPoint pointDNE1 = new MyPoint(2, 2);
        MyPoint pointDNE2 = new MyPoint(3, 3);
        MyPoint pointDNE3 = new MyPoint(4,4);
        System.out.println(pointDNE1.distance(pointDNE2));
        System.out.println(pointDNE2.distance(pointDNE3));
        System.out.println(pointDNE3.distance(pointDNE1));
        System.out.println(pointDNE1.distance(pointDNE2) + pointDNE2.distance(pointDNE3));

        MyTriangle doesNotExist = new MyTriangle(pointDNE1, pointDNE2, pointDNE3);
        System.out.println(doesNotExist);

        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle1);
        System.out.println(triangle1.getPerimeter());


        // This is an example of a triangle with a difference between
        // the largest and the smallest sides of less than 1%

        MyPoint point4 = new MyPoint(-4000 ,3200);
        MyPoint point5 = new MyPoint(9000, 1300);
        MyPoint point6 = new MyPoint(800, -9000);

        MyTriangle triangle2 = new MyTriangle(point4, point5, point6);

        System.out.println(point4.distance(point5));
        System.out.println(point5.distance(point6));
        System.out.println(point6.distance(point4));

        // This is an example of strictly isosceles triangle in integer coordinates
        MyTriangle triangle3 = new MyTriangle(-4, 0, 0, 6, 4, 0);

        System.out.println(triangle1.getType());
        System.out.println(triangle2.getType());
        System.out.println(triangle3.getType());

    }
}
