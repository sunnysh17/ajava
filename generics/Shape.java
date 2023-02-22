interface Shape{
void area();
}
class Circle implements Shape{
private float radius;
public Circle(float radius) {
super();
this.radius = radius;
}
@Override
public void area() {
System.out.printf("area of a circle with radius %.2f is %.2f\n", radius, (radius * radius * 3.14));
}
}
class Square implements Shape{
private float side;
public Square(float side) {
super();
this.side = side;
}
public void area() {
System.out.printf("area of a square with side %.2f is %.2f\n",side, side *side);
}
}
class BoundedShape<T extends Shape>{
private T object;
public void setObject(T object) {
this.object = object;
}
void findArea() 
{
object.area();
}
}
public class BoundedType {
public static void main(String[] args) 
{
// TODO Auto-generated method stub
BoundedShape<Shape> obj = new BoundedShape<>();
obj.setObject(new Circle(2));
obj.findArea();
obj.setObject(new Square(2));
obj.findArea();
}
}
