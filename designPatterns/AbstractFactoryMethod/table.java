package designPatterns.AbstractFactoryMethod;

public abstract class table {
abstract int noOfLeg();
abstract String colour();
}

class ModernTable extends table{
    @Override
    int noOfLeg() {
        return 4;
    }

    @Override
    String colour() {
        return "chocolate brown";
    }
}

class vintageTable extends table{
    @Override
    int noOfLeg() {
        return 2;
    }

    @Override
    String colour() {
        return "brown";
    }
}
