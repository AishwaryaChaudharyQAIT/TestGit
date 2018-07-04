import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    static String file1="C:\\Users\\AishwaryaChaudhary\\myspace\\MapInJava\\src\\Untitled 1";
    static String file2="C:\\Users\\AishwaryaChaudhary\\myspace\\MapInJava\\src\\Untitled 2";

    
   public String readScript(String filename) throws IOException
	{
		String line;
		BufferedReader bufferedReader=new BufferedReader(new FileReader(filename));
		while((line=bufferedReader.readLine()) !=null)
		{
			System.out.println(line);	
		}
		return line;  
	}
	public void writescript(String s,String fileName)throws IOException
	{
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(fileName, true));
		bufferedWriter.write(s);
		bufferedWriter.close();

	}
	public static void main(String args[]) throws IOException
	{
		ReadWrite r=new ReadWrite();
		Scanner sc=new Scanner(System.in);
		r.writescript(sc.nextLine(),file1);
		r.readScript(file1);
		r.writescript(sc.nextLine(), file1);
		r.readScript(file1);
	}
}
