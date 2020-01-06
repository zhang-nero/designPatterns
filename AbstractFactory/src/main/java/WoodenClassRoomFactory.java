package main.java;

/**
 * @author Nero
 * @since 2020-01-03 16:31
 */
public class WoodenClassRoomFactory extends AbstractClassRoomFactory {
    @Override
    public AbstractBench createBench() {
        return new WoodenBench();
    }

    @Override
    public AbstractDesk createDesk() {
        return new WoodenDesk();
    }
}
