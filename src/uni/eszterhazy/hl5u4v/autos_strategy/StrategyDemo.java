package uni.eszterhazy.hl5u4v.autos_strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        IElektronika el = getElektronika(true);
        IMotor m = getMotor(true);
        Auto auto = new Auto(m, el);
        auto.gyorsitas();
    }

    private static IElektronika getElektronika(boolean b) {
        return b ? new Bosch() : new Siemens();
    }

    private static IMotor getMotor(boolean b) {
        return b ? new Audi() : new BMW();
    }
}
