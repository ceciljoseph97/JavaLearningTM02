/*Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double),
 and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)*/

//Class Author
class Author{
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char sex){
		super();
		this.name=name;
		this.gender=sex;
		this.email=email;
		
	}
	public String getName(){
		return this.name;
		
	}
	public String getEmail() {
		return this.email;
		
	}
	public char getGender() {
		return this.gender;
		
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}


//Class Book
class Book{
	private String bookName;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.bookName = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
		}

	public double getPrice() {
		return price;
		
	}
	public void setPrice(double price) {
		this.price=price;
		
	}
	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return bookName;
	}

	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [name=" + bookName + ", author=" + author + "\n\t price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
	
}


public class BookAuthor {

	public static void main(String[] args) {
		Author author = new Author("Cecil Joseph", "emmi@yahoo.com", 'M');
		Book book = new Book("Quantum Computing:Gate Computational Model", author, 199.0, 500);
		
		System.out.println(book);
		

	}

}
