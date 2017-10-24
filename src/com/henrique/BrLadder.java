package com.henrique;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class BrLadder {	

	//private static final String fileName = "files/brladder.txt"
	
	public static void main(String arg[]) throws FileNotFoundException {
		NumberIO numberIO = new NumberIO(System.in);
		//NumberIO numberIO = new NumberIO(new FileInputStream(fileName));
		
		PrintWriter pw = new PrintWriter(System.out);
		
		long lines = numberIO.nextInt();
		for (int i = 0; i < lines; i++) {
			int c1 = numberIO.nextInt();
			int c2 = numberIO.nextInt();
			
			if(c1 % 2 == 0) {
				if(c2 == (c1 - 1) || c2 == (c1 + 2) || c2 == (c1 - 2)) {
					pw.println("YES");
				} else {
					pw.println("NO");
				}
			} else {
				if(c2 == (c1 + 1) || c2 == (c1 + 2) || c2 == (c1 - 2)) {
					pw.println("YES");
				} else {
					pw.println("NO");
				}
			}
		}
		pw.close();
	}
	
	static final class NumberIO {
		private BufferedInputStream inp;
		private int offset = 0;
		private int size = 1024 * 50; // 50kB
		private byte[] buff = new byte[size];

		private NumberIO(InputStream inputStream) {
			inp = new BufferedInputStream(inputStream);
			try {
				inp.read(buff, 0, size);
			} catch (IOException e) {
			}
		}

		public int nextInt() {
			int i = offset;
			// skip any spaces
			while (i < buff.length && (buff[i] == ' ' || buff[i] == '\t' || buff[i] == '\n')) {
				i++;
			}
			int sign = 1;
			if (i < buff.length && buff[i] == '-') {
				sign = -1;
			}
			// read digits and parse number
			int parsedInt = 0;
			while (i < buff.length && buff[i] >= '0' && buff[i] <= '9') {
				parsedInt *= 10;
				parsedInt += buff[i] - '0';
				i++;
			}
			// check if we reached end of buffer
			if (i == buff.length) {
				// copy leftovers to buffer start
				int j = 0;
				for (; offset < buff.length; j++, offset++) {
					buff[j] = buff[offset];
				}
				// and now fil the buffer
				try {
					inp.read(buff, j, size - j);
				} catch (IOException ignore) {
				}
				// and attempt to parse int again
				offset = 0;
				parsedInt = nextInt();
			} else {
				offset = i;
			}
			return parsedInt * sign;
		}
	}
	
}
