public class LambdaExpress {
interface add{
public void addition();
}
interface sub{
public void subtract();
}
interface multi{
public void multiplication();
}
public static void main(String[] args) {
// TODO Auto-generated method stub
int a=10;
int b= 20;
add add1 = ()->{
System.out.println("addition of two numbers is: "+ (a+b));
};
sub sub1 = ()->{
System.out.println("subtract of two numbers i: s"+ (b-a));
};
multi mul1 = ()->{
System.out.println("Multiplication of two numbers is: "+ (b*a));
};
add1.addition();
sub1.subtract();
mul1.multiplication();
}
}
