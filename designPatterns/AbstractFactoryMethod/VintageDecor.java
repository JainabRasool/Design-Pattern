package designPatterns.AbstractFactoryMethod;

public class VintageDecor implements Decor{
    @Override
    public chair getChair() {
        return new vintageChair();
    }

    @Override
    public sofa getSofa() {
        return new vintageSofa();
    }

    @Override
    public table getTable() {
        return new vintageTable();
    }
}
