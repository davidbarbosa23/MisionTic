package models;

public class Book {
    private int id;
    private int ISBN;
    private String name;
    private int pages;
    private String published;
    private int Editorial_id;
    private String extract;

    public Book(int id, int ISBN, String name, int pages, String published, int Editorial_id, String extract) {
        this.id = id;
        this.ISBN = ISBN;
        this.name = name;
        this.pages = pages;
        this.published = published;
        this.Editorial_id = Editorial_id;
        this.extract = extract;
    }

    public int getId() {
        return id;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public int getEditorial_id() {
        return Editorial_id;
    }

    public void setEditorial_id(int editorial_id) {
        Editorial_id = editorial_id;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }
}
