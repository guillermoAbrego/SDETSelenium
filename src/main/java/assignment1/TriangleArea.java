package assignment1;

import java.util.Scanner;

public class TriangleArea {

	// Write a program to calculate the area of a triangle. Users will enter the values for base and height of the triangle. 
	public static void main(String[] args) {
		double base = 0.0, height = 0.0, area = 0.0;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter traingle base: ");
		base = reader.nextDouble();
		System.out.println("Enter traingle height: ");
		height = reader.nextDouble();
		reader.close();
		area = calculateTriangleArea(base, height);
		System.out.println("Area of the triangle is: " + area);
	}
	
	static double calculateTriangleArea(double base, double height) {
		return (base * height) / 2;
	}
}
