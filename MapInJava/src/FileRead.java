import java.io.*;
public class FileRead {

	public static void main(String args[])throws IOException
	{
		String linet=null;
		String lines=null;
		FileReader ft=new FileReader("C:\\Users\\AishwaryaChaudhary\\Desktop\\t.txt");
		FileReader fs=new FileReader("C:\\Users\\AishwaryaChaudhary\\Desktop\\s.txt");
		
		BufferedReader bt=new BufferedReader(ft);
		BufferedReader bs=new BufferedReader(fs);
		
		while( ((linet=bt.readLine())!=null) && ((lines=bs.readLine())!=null) ) 
		{	
		if(!linet.equals(lines))	{
			System.out.println("file s and t are not equal");
			return;
		}
		
		}
		System.out.println("file s and t are equal");
		
	}
}
