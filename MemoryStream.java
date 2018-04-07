package quan.write;

import java.io.*;

public class MemoryStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "hello*word!!";
		InputStream in = new ByteArrayInputStream(str.getBytes());
		OutputStream out = new ByteArrayOutputStream();
		int m;
		while((m = in.read()) != -1) {
			out.write(Character.toUpperCase(m));
		}
		System.out.println(out);
		in.close();
		out.close();
	}

}
