package week2.assignment.methods;

public class LibraryManagement {

	public static void main(String[] args) {
		// creating a object for Library class 
		Library lib=new Library();
		System.out.println(lib.addBook("Python"));
		lib.issueBook(); 
	}

}
