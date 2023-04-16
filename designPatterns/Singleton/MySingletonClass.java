package designPatterns.Singleton;

public class MySingletonClass{
    private MySingletonClass() {
    }
   static MySingletonClass obj= new MySingletonClass();
    public static MySingletonClass getInstance(){
         return obj;
    }
}

class main{
    public static void main(String a[]){

        MySingletonClass m= MySingletonClass.getInstance();
        System.out.println(m);

        MySingletonClass m1= MySingletonClass.getInstance();
        System.out.println(m1);

    }
}
