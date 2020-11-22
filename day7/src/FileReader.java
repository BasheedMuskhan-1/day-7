
import java.io.*;
public class FileReader {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\MY\\eclipse-workspace\\day7\\src\\FileReader.java");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.print("finally");
		}
		

	}

}