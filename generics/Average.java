public class AverageGeneric<T extends Number> {
T[] numArr;
public AverageGeneric(T[] numArr){
this.numArr = numArr;
}
public double getAvg() {
double sum = 0.0;
for(int i=0;i<numArr.length;i++) {
sum+=numArr[i].doubleValue();
}
double avg = sum/numArr.length;
return avg;
}
public void isEqual(AverageGeneric<Number> obj2) {
if(this.getAvg() == obj2.getAvg()) {
System.out.println("Both Array Objects are Equal");
}
else {
System.out.println("Both Array Objects are Not Equal");
}
}
public static void main(String[] args) {
Integer i1[] = {12,13,45,76,89};
AverageGeneric<Integer> e1 = new AverageGeneric<Integer>(i1);
Double ai = e1.getAvg();
System.out.println("Average of Integers = "+ai);
Double arr1[] = {1.0,2.0,3.0,4.0,5.0, 6.0};
AverageGeneric<Number> obj2 = new AverageGeneric<>(arr1);
e1.isEqual(obj2);
}
}
