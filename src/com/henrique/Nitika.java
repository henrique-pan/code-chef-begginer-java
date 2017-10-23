package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nitika {
	public static void main(String[] args) {
		//String fileName = "files/nitika.txt";

		// read file into stream, try-with-resources
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		//try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			int lineNumber = 0;
			String line;
			while ((line = br.readLine()) != null) {
				if (lineNumber > 0) {
					String[] s = line.split(" ");

					if (s.length == 1) {
						String firstLetter = s[0].trim().substring(0, 1).toUpperCase();
						String name = firstLetter + s[0].toLowerCase().substring(1, s[0].length());
						System.out.println(name);
					} else if (s.length == 2) {
						String firstName = s[0].trim().substring(0, 1).toUpperCase() + ". ";

						String firstLetter = s[1].trim().substring(0, 1).toUpperCase();
						String name = firstName + firstLetter + s[1].toLowerCase().substring(1, s[1].length());

						System.out.println(name);
					} else {
						String firstName = s[0].trim().substring(0, 1).toUpperCase() + ". ";

						String secondName = s[1].trim().substring(0, 1).toUpperCase() + ". ";
						
						String firstLetter = s[2].trim().substring(0, 1).toUpperCase();
						String name = firstName + secondName + firstLetter + s[2].toLowerCase().substring(1, s[2].length());

						System.out.println(name);
					}
				} else {
					lineNumber++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
