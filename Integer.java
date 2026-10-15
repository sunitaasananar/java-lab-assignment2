package Assig2;

import java.util.Scanner;

public interface Integer {
	 void check();
	}
	class NumberCheck implements Integer {
	    int num;
	    NumberCheck(int num) {
	        this.num = num;
	    }
	    public void check() {
	        if (num > 0) {
	            System.out.println("Number is Positive");
	        } else if (num < 0) {
	            System.out.println("Number is Negative");
	        } else {
	            System.out.println("Number is Zero");
	        }
	    }
	}

	public class TestInteger {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = sc.nextInt();
	        NumberCheck obj = new NumberCheck(n);
	        obj.check();
	        sc.close();
	    }
	}
}
