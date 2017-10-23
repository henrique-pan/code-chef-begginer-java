package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Intest {
	//private static final String fileName = "files/intest.txt";

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String[] firstLine = br.readLine().split(" ");
		int k = Integer.parseInt(firstLine[1]);
		int result = 0;
		String line;
		while ((line = br.readLine()) != null) {
			long n = Long.parseLong(line);

			if (n % k == 0) {
				result++;
			}
		}

		pw.println("" + result);
		
		br.close();
		pw.close();
	}
}
