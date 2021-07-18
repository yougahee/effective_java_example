package chapter2.try_with_resource;

import java.io.*;

public class Try_Finally_Resource {

	static int BUFFER_SIZE = 11;

	//자원이 하나일 때, try-finally-resource
	static String firstLineOfFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader(path))) {
			return br.readLine();
		}
	}

	//자원이 여러개 일 때,
	static void copy(String src, String dst) throws IOException {
		try (InputStream in = new FileInputStream(src);
		     OutputStream out = new FileOutputStream(dst)) {
			byte[] buf = new byte[BUFFER_SIZE];
			int n;
			while ((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);
		}
	}
}
