package Assig2;

import java.util.Scanner;

public interface Shape {
	 double area();
	}
	class Circle implements Shape {
	    final double radius;
	    Circle(double radius) {
	        this.radius = radius;
	    }
	    public double area() {
	        return Math.PI * radius * radius;
	    }
	}
	class Sphere implements Shape {
	    final double radius;
	    Sphere(double radius) {
	        this.radius = radius;
	    }
	    public double area() {
	        return 4 * Math.PI * radius * radius;
	    }
	}
	public class Area {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius of circle: ");
	        final double r1 = sc.nextDouble();
	        System.out.print("Enter radius of sphere: ");
	        final double r2 = sc.nextDouble();
	        Circle c = new Circle(r1);
	        Sphere s = new Sphere(r2);
	        System.out.println("Area of Circle = " + c.area());
	        System.out.println("Surface Area of Sphere = " + s.area());
	        sc.close();
	    }
	}
}
