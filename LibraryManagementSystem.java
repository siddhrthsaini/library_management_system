package projects.library_management_system;

class Library {
    String[] Books;
    String[] issuedBooks;
    int no_ofBooks;

    public Library() {
        this.Books = new String[100];
        this.issuedBooks = new String[100];
        this.no_ofBooks = 0;
    }

    public void addBook(String book) {
        //System.out.println("Enter the book you want to add....");
        this.Books[no_ofBooks] = book;
        no_ofBooks++;
        System.out.println("ThankYou the book " + book + " has been successfully added");
    }

    public void showAvailableBook() {
        System.out.println("Available books are...\n");

        for (String i : this.Books) {
            if (i == null) {
                continue;
            }
            System.out.println("-->"+ i);
        }
    }

    public void issueBook(String books) {
        for (int i = 0; i < this.Books.length; i++) {
            if (this.Books[i] == books) {
                System.out.println("The book has been issued\n");
                this.Books[i] = null;
            }

        }
    }
        public void returnBook(String book){
            this.Books[no_ofBooks] = book;
            System.out.println( "the book" + book+ "has been sucesfull returned " );
        }


    }


public class LibraryManagementSystem {
    public static void main(String[] args) {


        Library add = new Library();
        add.addBook("MONSTER THE WAY TO HELL");add.addBook("JAVA");add.addBook("PYTHON");add.addBook("DATA SCIENCE");
        add.addBook("MONSTER THE WAY TO heaven");
        add.showAvailableBook();
        add.issueBook("MONSTER THE WAY TO HELL");
        add.showAvailableBook();
        add. returnBook("MONSTER THE WAY TO HELL");
        add.showAvailableBook();
    }
}
