import java.util.*;
abstract class Main {
	protected int area,x;
	int calculate(){
			return 3*3;
	}
	void display(){
		System.out.println("abstract class");
    }
}

class Circle extends Main
{
int calculate(){	
	return 4*4;
}
void display(){
	System.out.println("circle class");
}
}

class Rectangle extends Circle{
	int calculate(){
	return 5*5;
	}
  void display(){
		System.out.println("rec class");
	}
}

class Abs{
	public static void main(String agrs[]){
	    Circle c=new Circle();
		Rectangle r=new Rectangle();
		System.out.println(c.calculate());
		System.out.println(r.calculate());
		c.display();
		r.display();
	}
}