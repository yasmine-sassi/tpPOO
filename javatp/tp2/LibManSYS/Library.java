import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}

class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int yearOfPublication, String genre) {
        super(title, author, yearOfPublication);
        this.genre = genre;
    }

    public void displayInformation() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Genre: " + genre);
    }
}

class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int yearOfPublication, String subject) {
        super(title, author, yearOfPublication);
        this.subject = subject;
    }

    public void displayInformation() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
        System.out.println("Subject: " + subject);
    }
}

class Library {
    private ArrayList<Book> inventory;

    public Library() {
        this.inventory = new ArrayList<>();
    }
    public void addBook(Book book) {
        inventory.add(book);
        System.out.println(book.getTitle()+" added to the library");
    }

    public void removeBook(Book book) {
        if (inventory.contains(book)) {
            inventory.remove(book);
            System.out.println(book.getTitle()+" removed from the library");
        } else {
            System.out.println("Book not found");
        }
    }

    public void listBooks() {
        System.out.println("Library:");
        for (Book book : inventory) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}

interface LibraryUser {
    void borrowBook(Book book);
    void returnBook(Book book);
}

class Student implements LibraryUser {
    private String studentName;
    private LibraryCard libraryCard;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.libraryCard = new LibraryCard(id);
    }
    public void borrowBook(Book book) {
        System.out.println(studentName + " borrowed the book " + book.getTitle());
    }
    public void returnBook(Book book) {
        System.out.println(studentName + " returned the book " + book.getTitle());
    }
}

class Teacher implements LibraryUser {
    private String teacherName;
    private LibraryCard libraryCard;

    public Teacher(String teacherName, int id) {
        this.teacherName = teacherName;
        this.libraryCard = new LibraryCard(id);
    }
    public void borrowBook(Book book) {
        System.out.println(teacherName + " borrowed the book " + book.getTitle());
    }

    public void returnBook(Book book) {
        System.out.println(teacherName + " returned the book " + book.getTitle());
    }
}

class LibraryCard {
    private int id;
    public LibraryCard(int id){
        this.id=id;
    }
    
}
