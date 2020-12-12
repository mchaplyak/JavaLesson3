package classWork;

public class Drums implements Instrument{
    private int size = 15;


    public Drums(int size) {
        this.size = size;
    }

    public Drums() {

    }

    @Override
    public void play() {
        System.out.println("Малий барабан звучить, його розмір " + size + " дюймів");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drums{" +
                "size=" + size +
                '}';
    }
}
