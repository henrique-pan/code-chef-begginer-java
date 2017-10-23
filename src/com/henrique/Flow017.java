package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flow017 {

	public static void main(String[] args) {
		//String fileName = "files/flow017.txt";

		// read file into stream, try-with-resources
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		//try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			int lineNumber = 0;
			String line;
			while ((line = br.readLine()) != null) {
				if (lineNumber > 0) {
					String[] s = line.split(" ");

					int l = 0;
					int sl = 0;
					for (int i = 0; i < s.length; i++) {
						int t = Integer.parseInt(s[i]);
						if (i == 0) {
							l = t;
						} else if (i == 1) {
							if (l > t) {
								sl = t;
							} else {
								sl = l;
								l = t;
							}
						} else {
							if (sl < t) {
								if(l > t) {
									sl = t;
								} else {
									sl = l;
								}
							} 
						}
					}
					System.out.println(sl);
				} else {
					lineNumber++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
