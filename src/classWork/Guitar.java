package classWork;

public class Guitar implements Instrument{

    private int stringNumber = 6;

    public Guitar(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Грає гітара, в неї " + stringNumber + " струн");
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "stringNumber=" + stringNumber +
                '}';
    }
}
