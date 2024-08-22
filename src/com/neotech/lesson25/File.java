package com.neotech.lesson25;

public abstract class File {
	/*
	 * Create a class File that will have the following behaviors: open(), edit(), close()
	 * Edit() and close() are implemented methods while open() is abstract.
	 * 
	 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide 
	 * specific implementation of open() behavior.
	 */

	public abstract void open();

	public void edit() {
		System.out.println("File can be edited");
	}

	public void close() {
		System.out.println("File can be closed");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open a Java file you need the Eclipse");
	}
}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open a Word file you need the Word App");

	}

}

class PdfFile extends File {

	@Override
	public void open() {
		System.out.println("To open the Pdf file you need the Acrobat Reader");

	}


}
