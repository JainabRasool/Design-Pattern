package designPatterns.AbstractFactoryMethod;

public class ModernDecor implements Decor{
    @Override
    public chair getChair() {
        return new ModernChair();
    }

    @Override
    public sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public table getTable() {
        return new ModernTable();
    }


}
