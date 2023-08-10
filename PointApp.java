package assignment;
import java.util.Scanner; 
import java.io.*; 
// import java.lang.Obejct;

public class PointApp {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("points.text")); 
		
		while(input.hasNext()) {
			Point pt1 = new Point(input.nextInt(), input.nextInt());
			Point pt2 = new Point(input.nextInt(), input.nextInt());
			ptPrinter(pt1, pt2);
			ptSum(pt1, pt2);
			ptRefChecker(pt1, pt2); 
			ptOriChecker(pt1, pt2); 
			ptDistPrinter(pt1, pt2);
			System.out.println();
		}
	}
	public static void ptPrinter(Point pt1, Point pt2) {
		System.out.print("p1: " + pt1.toString() + " (quadrant " + pt1.quadrant()); 
		System.out.println(") / p2: " + pt2.toString() + " (quadrant " + pt2.quadrant()+")");
	}
	public static void ptSum(Point pt1, Point pt2) {
		// Point pt3 = new pt1.add(pt2);
		System.out.println("p1+p2: "+ pt1.add(pt2).toString() + " (quadrant " + pt1.add(pt2).quadrant()+")");
	}
	public static void ptRefChecker(Point pt1, Point pt2) {
		if(pt1.equals(pt2.xReflection())) {
			System.out.println("p1 and p2 are reflections across the x-axis");
		}
		if(pt1.equals(pt2.yReflection())) {
			System.out.println("p1 and p2 are reflections across the y-axis"); 
		}
		if(pt1.equals(pt2.originReflection())) {
			System.out.println("p1 and p2 are reflections through the origin"); 
		}
	}
	public static void ptOriChecker(Point pt1, Point pt2) {
		Point origin = new Point();
		if(pt1.distance(origin) == pt2.distance(origin)) {
			System.out.println("p1 and p2 are equidistant from the origin");
		}
	}
	public static void ptDistPrinter(Point pt1, Point pt2) {
		System.out.print("The distance between "+ pt1.toString() + " and "); 
		System.out.println(pt2.toString() + " is " + pt1.distance(pt2)); 
	}

}

//int size = readArr(input, pts);
//for(int i=0; i<size; i++) {
//	ptPrinter(pts,i);
//	ptSum(pts,i);
//	ptRefChecker(pts, i); 
//	ptOriChecker(pts, i); 
//	ptDistPrinter(pts,i);
//	System.out.println();
//}
//
//}
//
//public static int readArr(Scanner input, int[][] arr) {
//int size=0; 
//while(input.hasNext()) {
//	arr[size][0] = input.nextInt();
//	arr[size][1] = input.nextInt();
//	arr[size][2] = input.nextInt();
//	arr[size][3] = input.nextInt();
//	size++;
//}
//return size;
//}
//public static void ptSum() {
