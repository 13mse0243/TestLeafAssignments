package week2.assignment.methods;

public class Library {
	//creating a method addBook with parameter bookTitle and returning it
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
//creating a method issueBook with return type as void, as we are not going to return anything
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		//creating a object for Library class 
		Library lib=new Library();
		System.out.println(lib.addBook("DBMS"));
		lib.issueBook();
	}

}
