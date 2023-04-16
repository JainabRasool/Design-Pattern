package designPatterns.AbstractFactoryMethod;

public abstract class chair {
    public abstract int noOfLegs();
      abstract String cusionType();

}

class ModernChair extends chair
{
    @Override
    public int noOfLegs() {
        return 4;
    }

    @Override
    String cusionType() {
        return "SuperSoft";
    }


}

class vintageChair extends chair {
    @Override
    public int noOfLegs() {
        return 3;
    }

    @Override
    String cusionType() {
        return "hard";
    }
}
