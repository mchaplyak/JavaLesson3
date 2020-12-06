public class Magazine implements Printable{

    private String name;
    private int pages;
    private int numberOfCopies;

    public Magazine(String name, int pages, int numberOfCopies) {
        this.name = name;
        this.pages = pages;
        this.numberOfCopies = numberOfCopies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public void print() {
        System.out.println("Magazine is printed");
    }

    public static void printMagazines(String name, int numberOfCopies) {
        System.out.println(
                name + " is printed \n" +
                "Number Of Copies: " + numberOfCopies
        );
    }
}
