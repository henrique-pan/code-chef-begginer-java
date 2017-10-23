package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Hs08test {

	//private static final String fileName = "files/hs08test.txt";

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
				
		String line;
		while ((line = br.readLine()) != null) {
			String s[] = line.trim().split(" ");

			int x = Integer.parseInt(s[0]);
			float total = Float.parseFloat(s[1]);
			float amount = (float)(total - x - 0.5);
			if(x >= 5 && x % 5 == 0 && amount > 0) {
				pw.println(String.format("%.2f", amount));
			} else {
				pw.println(s[1]);
			}

		}
		br.close();
		pw.close();
	}
}
