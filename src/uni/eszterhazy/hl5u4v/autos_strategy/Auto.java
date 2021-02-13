package uni.eszterhazy.hl5u4v.autos_strategy;

public class Auto {
    IMotor motor;
    IElektronika elektronika;

    public Auto(IMotor motor, IElektronika elektronika) {
        this.motor = motor;
        this.elektronika = elektronika;
    }

    public void gyorsitas(){motor.gyorsitas();}
    public void lampaSet(boolean fel) {
        elektronika.lampaSet(fel);
    }
}
