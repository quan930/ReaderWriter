package quan.write;

import java.io.*;

public class FileReaderWriterTwo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n;
		File file = new File("/Users/daquan/Documents/llq2.txt");
		FileInputStream in = new FileInputStream(file);
		Reader read = new InputStreamReader(in);
//		byte as[] = new byte[2];
//		while((n=in.read(as,0,2))!=-1){
//			String s = new String(as,"UTF-8");
//			System.out.print(s);
//        }
		while((n=read.read())!=-1) {
			System.out.print((char)n);
		}
		read.close();
	}
}
