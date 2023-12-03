public class LibraryManagementSystem {
    public static void main(String[] args) {
        Novel novel = new Novel("python", "john", 1960, "info");
        Textbook textbook = new Textbook("Java", "DJJ", 2018, "Computer Science");

        Library library = new Library();
        library.addBook(novel);
        library.addBook(textbook);
        library.listBooks();
        Student student = new Student("yasmine",1);
        Teacher teacher = new Teacher("sassi",2);

        student.borrowBook(novel);
        teacher.borrowBook(textbook);

        student.returnBook(novel);
        teacher.returnBook(textbook);

        library.removeBook(textbook);
        library.listBooks();
    }
}
