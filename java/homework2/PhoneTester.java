package homework2;

public class PhoneTester {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.number = 12345678;
        p1.model = "iPhone";
        p1.weight = 0.2;

        Phone p2 = new Phone();
        p2.number = 87654321;
        p2.model = "Samsung";
        p2.weight = 0.4;

        Phone p3 = new Phone();
        p3.number = 54823917;
        p3.model = "Xiomi";
        p3.weight = 0.4;
//
//        System.out.println("Number " + p1.number + " Model " + p1.model + " Weight " + p1.weight);
//        System.out.println("Number " + p2.number + " Model " + p2.model + " Weight " + p2.weight);
//        System.out.println("Number " + p3.number + " Model " + p3.model + " Weight " + p3.weight);

        p1.receiveCall("Dusya");
        System.out.println("Номер телефона " + p1.getNumber());

        p2.receiveCall("Ivan");
        System.out.println("Номер телефона " + p2.getNumber());

        p3.receiveCall("John");
        System.out.println("Номер телефона " + p3.getNumber());


      }
}
