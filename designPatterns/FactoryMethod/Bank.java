package designPatterns.FactoryMethod;

public abstract class Bank {
    abstract int interestRate();
    abstract String bankName();
    public void bankDetails(){
        System.out.println("Bank deatils are: "+bankName()+" Interest Rate  "+interestRate());
    }
}

class HDFCBank extends Bank{
    int interestRate() {
        return 7;
    }

    String bankName() {
        return "HDFC BANK";
    }
}


class SBIBank extends Bank{
    int interestRate() {
        return 5;
    }

    String bankName() {
        return "SBI BANK";
    }
}


class  BankFactory{
    public static Bank getBankObject(String s){
        if(s.equalsIgnoreCase( "hdfc")){
            return new HDFCBank();
        }
        else
            return new SBIBank();
    }
}

class Mymain{
    public static void main(String ar[]){
       // Bank b=new HDFCBank();
      //   Bank b=new SBIBank();
        Bank b=BankFactory.getBankObject("HDFC");
        b.bankDetails();
    }
}