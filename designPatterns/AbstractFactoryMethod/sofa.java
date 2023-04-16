package designPatterns.AbstractFactoryMethod;

public abstract class sofa {
    abstract int lenght();
    abstract String coverMaterial();
}

class ModernSofa extends  sofa{
    @Override
    int lenght() {
        return 10 ;
    }

    @Override
    String coverMaterial() {
        return "satin cloth";
    }
}

class vintageSofa extends sofa{
    @Override
    int lenght() {
        return 5;
    }

    @Override
    String coverMaterial() {
        return "cotton cloth";
    }
}