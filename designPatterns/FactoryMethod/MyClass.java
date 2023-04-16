package designPatterns.FactoryMethod;

public abstract class MyClass {
    abstract void m1();
 }

class MychildClass1 extends MyClass{
    void m1(){
        System.out.println("MyChildClass1");}
}
class MychildClass2 extends MyClass{
    void m1() {
        System.out.println("MyChildClass2");}
}
class MychildClass3 extends MyClass{
    void m1() {
        System.out.println("MyChildClass3");
    }
}

class MyClassFactory {
    public static MyClass getMyObject(String str) {
        if (str.equals("1")) {
            return new MychildClass1();
        } else if (str.equals("2")) {
            return new MychildClass2();

        } else if (str.equals("3")) {
            return new MychildClass3();
        }
        else
            return new MychildClass1();
    }
}
class main{
    public static void main(String []a){
        MyClass mc= MyClassFactory.getMyObject("2");
        mc.m1();


    }
}
