public class Book implements Printable{

    private String cover;
    private String name;
    private int pages;

    public Book(String cover, String name, int pages) {
        this.cover = cover;
        this.name = name;
        this.pages = pages;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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

    @Override
    public String toString() {
        return "Book{" +
                "cover='" + cover + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Book is printed");
    }

    public static void printBook(String name) {
        System.out.println(name + " is printed");
    }
}
