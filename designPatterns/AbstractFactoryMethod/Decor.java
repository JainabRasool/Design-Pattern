package designPatterns.AbstractFactoryMethod;

public interface Decor {

   public chair getChair();
   public sofa getSofa();
   public table getTable();

   default String furnitureDetails(){
      return "Chair ->> "+ " No of Legs "+getChair().noOfLegs() + " , Cusion Type is "+ getChair().cusionType() + "\n"
              +"Sofa ->> "+ " Sofa length is "+getSofa().lenght()+ " ,  Cover material is " +getSofa().coverMaterial()+ "\n"
              +"Table ->> " +" No of legs " +getTable().noOfLeg()+ " ,  Table color is " +getTable().colour();

       }



}
