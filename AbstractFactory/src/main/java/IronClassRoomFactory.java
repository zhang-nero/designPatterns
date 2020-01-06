package main.java;

/**
 * @author Nero
 * @since 2020-01-03 16:31
 */
public class IronClassRoomFactory extends AbstractClassRoomFactory {
    @Override
    public AbstractBench createBench() {
        return new IronBench();
    }

    @Override
    public AbstractDesk createDesk() {
        return new IronDesk();
    }
}
