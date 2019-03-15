package lk.zone24x7.androidpothgula;

/**
 * Created by Avinath on 3/5/2019.
 */
class Book {
    private String author;
    private String bookname;
    private String photoUrl;

    public Book(String author, String bookname, String photoUrl) {
        this.author = author;
        this.bookname = bookname;
        this.photoUrl = photoUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
