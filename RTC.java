import java.util.*;
import java.io.*;

interface shape {
	public void read();
	public void disp();
	public void area();
}

class circle implements shape{
	int radius;
	float ar;
	public void read(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius = s.nextInt();
	}
	public void area(){
		ar = 3.14f*radius*radius;
		
	}
	public void disp(){
		System.out.println("Area of the circle is: "+ar);
	}
}

class rect implements shape{
	int length;
	int breadth;
	int ar;
	public void read(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = s.nextInt();
		System.out.println("Enter the breadth: ");
		breadth = s.nextInt();
	}
	public void area(){
		ar = length*breadth;
	}
	public void disp(){
		System.out.println("Area of the Rectangle is: "+ar);
	}
}


class triangle implements shape{
	int height;
	int breadth;
	float ar;
	public void read(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = s.nextInt();
		System.out.println("Enter the breadth: ");
		breadth = s.nextInt();
	}
	public void area(){
		ar = 0.5f*breadth*height;
	}
	public void disp(){
		System.out.println("Area of the Triangle is: "+ar);
	}
}

public class RTC{
	public static void main(String args[]){
		int ch=0;
		do{
			System.out.println("\nShape Menu Driven");	
			System.out.println("1.Find Area of Circle");
			System.out.println("3.Find Area of Rectangle");
			System.out.println("3.Find Area of Triangle");
			System.out.println("4.Exit");
			System.out.print("\nEnter your Choice: ");
			Scanner s = new Scanner(System.in);
			ch = s.nextInt();
			
			switch(ch){
				case 1:
					shape obj1;
					obj1 = new circle();
					obj1.read();
					obj1.area();
					obj1.disp();
					break;
				case 2:
					shape obj2;
					obj2 = new rect();
					obj2.read();
					obj2.area();
					obj2.disp();
					break;
				case 3:
					shape obj3;
					obj3 = new triangle();
					obj3.read();
					obj3.area();
					obj3.disp();
					break;

				case 4:
					System.out.println("Exiting...");
					break();
			}
		}while(ch!=4);	
	}

}






