package application;

import java.util.ArrayList;
import java.util.List;

import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;

public class Program {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();

		list.add(new Circle(3.0));
		list.add(new Triangle(3.0, 2.0));
		
		System.out.println(max(list));

	}
	public static double max(List<Shape> list) {
		double max = 0;
		for(Shape s : list) {
			max += s.area();
		}
		return max;
	}

}
