package com.neotech.lesson25;

public class FileTest {

	public static void main(String[] args) {
		// File file = new File();

				File java = new JavaFile();
				File pdf = new PdfFile();

				File[] files = { java, pdf };

				// 2nd way
				File[] files2 = { new JavaFile(), new PdfFile(), new WordFile() };

				for (File file : files2) {
					file.open();
					file.edit();
					file.close();
				}

	}

}
