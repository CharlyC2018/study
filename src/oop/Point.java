package oop;

/**
 * 
 * @author Charly 
 * 定义一个point类用来表示二位空间中的点（x，y）。要求如下： 
 * 1. 可以生成具有特定坐标的点对象。
 * 2. 提供可以计算该point 距另外一个 point 距离的方法。
 * 
 */

public class Point {
	double x, y;

	Point(double _x, double _y) {
		x = _x;
		y = _y;
	}

	public double getDistance(Point p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}

	public static void main(String[] args) {
	
		Point p1 = new Point(3.0, 4.0);
		Point p2 = new Point(2.0, 4.0);
		Point origin = new Point(0, 0);
		
		System.out.println(p1.getDistance(origin));
		System.out.println(p2.getDistance(origin));
	}
}