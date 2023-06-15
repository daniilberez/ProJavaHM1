package homework2;

public class Phone {
     int number;
     String model;
     double weight;

     // method
     public void receiveCall(String name){
          System.out.println("Звонит " + name);
     }
     public int getNumber(){
          return number;
     }

}
