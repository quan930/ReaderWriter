package quan.write;

import java.io.*;

public class FileReaderWriterOne {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		File file1 = new File("/Users/daquan/Documents/llq.txt");
		File file2 = new File("/Users/daquan/Documents/llq2.txt");
		if(file1.exists()) {
			Reader read = new FileReader(file1);
			if(!file2.getParentFile().exists()) {
				file2.getParentFile().mkdirs();
			}
			Writer write = new FileWriter(file2);
			int n;
			while((n = read.read())!=-1) {
				write.write(n);
			}
			long end=System.currentTimeMillis();
			System.out.println(end-start);
			read.close();
	        write.close();
		}else {
			System.out.println("没有读取文件");
			System.exit(1);
		}
	}

}
