package com.henrique;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Flow001 {

	private static final String fileName = "files/flow001.txt";
	
	public static void main(String[] args) throws IOException {		
		Printer printer = new Printer();

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		int testCases = Integer.parseInt(br.readLine());
		while (testCases != 0) {
			String s[] = br.readLine().trim().split(" ");

			int result = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);

			printer.println("" + result);
			testCases--;
		}
		br.close();
		printer.close();
	}

	private static class Printer {
		private final BufferedWriter bw;

		public Printer() {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(String str) throws IOException {
			bw.append(str);
		}

		public void println(String str) throws IOException {
			print(str);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}

}
