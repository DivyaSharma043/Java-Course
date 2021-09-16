public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Instructor(long id, String name, String title, String department, Book[] books) {
		// your code
		this(id, name, title, department);
		this.books = books;
			}
	
	public Instructor(long id, String name, String title, String department) {
		// your code
		this(id, name, title);
		this.department = department;
	}
	
	public Instructor(long id, String name, String title) {
		// your code
		this(id, name);
		this.title = title;
	}
	
	public Instructor(long id, String name) {
		// your code
		this.id = id;
		this.name = name;
	}
	
	public String getMostRecentBookTitle() {
		// your code
	return books[books.length-1].title;
	}
	
	public Book updateBook(int index, String title) {
		// your code
		   Book Books = books[0];
        Book[] updatedBooks = new Book[books.length + 1];
        int i = 0;
        int j = 0;

        while (i < updatedBooks.length) {
            if (i == index) {
                updatedBooks[i] = new Book(title);
                Books = books[i];
            } else {
                updatedBooks[i] = books[j];
            }

            i++;

            if (i != index) {
                j++;
            }
        }

        books = updatedBooks;

        return Books;
    }
	
	public Book updateBook(int index, Book book) {
		// your code
		for (int i = 0; i < books.length; i++) {
            if (i == index) {
                Book oldBook = books[i];
                books[i] = book;
                return oldBook;
            }
        }

        return new Book("");
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}