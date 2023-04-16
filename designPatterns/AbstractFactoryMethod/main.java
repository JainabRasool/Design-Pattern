package designPatterns.AbstractFactoryMethod;

public class main {
    public static void main(String a[]){
Decor d=DecorFactory.getDecorDetails("vintage");
System.out.println(d.furnitureDetails());

    }
}
