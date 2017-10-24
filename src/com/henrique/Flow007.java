package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Flow007 {

	// private static final String fileName = "files/flow007.txt";
	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String line;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			sb.append(line);
			pw.println(sb.reverse());
			sb.setLength(0);
		}

		br.close();
		pw.close();
	}
}
