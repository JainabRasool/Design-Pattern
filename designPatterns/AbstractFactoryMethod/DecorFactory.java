package designPatterns.AbstractFactoryMethod;

public class DecorFactory {
    public static Decor getDecorDetails(String s){
        System.out.println(s + " furniture details are:::" +"\n");
        if(s.equalsIgnoreCase("modern"))
            return new ModernDecor();
        else if (s.equalsIgnoreCase("vintage"))
            return new VintageDecor();
        else
            return null;
    }
}
