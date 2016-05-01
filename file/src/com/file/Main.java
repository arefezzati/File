package com.file;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.BufferedReader;
	import java.io.FileReader;
	public class Main {
		public static void main(String[] args) {
			try {
				String content = "This is the content to write into file.";
				File file = new File("src/test.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content);
				bw.close();
				System.out.println("Done!");
			} catch (IOException e) {
				e.printStackTrace();
			}

		java.io.BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("src/test.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
	}
