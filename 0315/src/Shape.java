
class Shape {
 protected int x, y;
 	 public void draw(){
	 System.out.println("Shape Draw");
 }
 
}
class Rectangle extends Shape{
	 public void draw(){
		 System.out.println("Rectangle  Draw");
	 }
}
class Triangle extends Shape{
	 public void draw(){
		 System.out.println("Triangle Draw");
	 } 
}
class Circle extends Shape{
	 public void draw(){
		 System.out.println("Circle Draw");
	 }
}

