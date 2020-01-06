package main.java;

/**
 * @author Nero
 * @since 2017/11/20
 */
public class Main {
    public static void main(String[] args) {
        AbstractClassRoomFactory woodenClassRoomFactory = new WoodenClassRoomFactory();
        woodenClassRoomFactory.createBench().printBench();
        woodenClassRoomFactory.createDesk().printDesk();


        AbstractClassRoomFactory ironClassRoomFactory = new IronClassRoomFactory();
        ironClassRoomFactory.createDesk().printDesk();
        ironClassRoomFactory.createBench().printBench();
    }
}
