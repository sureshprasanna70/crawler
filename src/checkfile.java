
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;

import java.io.*;
public class checkfile {
public static void main(String arg[])
{
	Document doc=null;
	String sfb=null;
	try
	{
	
	System.out.println("This goes to the console");
	PrintStream console = System.out;

	File file = new File("/home/suresh/out.txt");
	FileOutputStream fos = new FileOutputStream(file);
	PrintStream ps = new PrintStream(fos);
	System.setOut(ps);
	System.out.println("This goes to out.txt");

	System.setOut(console);
	System.out.println("This also goes to the console");
	
	File n=new File("/home/suresh/resultsource.html");
	doc=Jsoup.parse(n,"UTF-8", "http://example.com/");
	Elements fb=doc.select("body");
	sfb=fb.text();
	File f=new File("/home/suresh/suttaresult");
	FileWriter fw=new FileWriter(f,true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(sfb);
	bw.write("hello1");
	bw.close();
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	System.out.print("sucees"+sfb);
}
}
