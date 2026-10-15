package Assig2;

public class Circle {
	 double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    double area() {
	        return Math.PI * radius * radius;
	    }
	}

	class Cylinder extends Circle {
	    double height;

	    Cylinder(double radius, double height) {
	        super(radius);
	        this.height = height;
	    }

	    double area() {
	        return 2 * Math.PI * radius * (radius + height);
	    }
	}

	public class Area {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();

	        System.out.print("Enter height: ");
	        double h = sc.nextDouble();

	        Circle c = new Circle(r);
	        Cylinder cy = new Cylinder(r, h);

	        System.out.println("Area of Circle = " + c.area());
	        System.out.println("Area of Cylinder = " + cy.area());

	        sc.close();
	    }
	}
}
