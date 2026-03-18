class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }
}

class EBook extends Book {
    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }
}