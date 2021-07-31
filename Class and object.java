/* class and object in java */

class MyClass{
int x = 5;
int y = 10;
public static void main(String[] args){
MyClass obj1 = new MyClass();
MyClass obj2 = new MyClass();
System.out.println("Output of MyClass is"+obj1.x);
System.out.println("Output of MyClass is"+obj2.x);
}
}




class OtherClass{
public statis void main(string[] args){
MyClass obj = new MyClass();
System.ot.println("output of MyClass from OtherClass is"+obj.y);
}
}
