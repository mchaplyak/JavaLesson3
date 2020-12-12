package classWork;

public class Tube implements Instrument{
    private int diameter = 5;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public Tube() {

    }

    @Override
    public void play() {
        System.out.println("Труба звучить, її діметр: " + diameter + " дюймів");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diameter=" + diameter +
                '}';
    }
}
