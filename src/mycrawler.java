import org.apache.commons.codec.binary.Base64;


import org.jsoup.Jsoup;

import java.io.*;



import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;
import java.util.* 
;
public class mycrawler
{

public static void main(String[] args) throws IOException 
{
//	File file=null;
	
	int start=0,finish=0;
	Scanner f=new Scanner(System.in);
	//2BufferedInputStream bs=new BufferedInputStream(System.in);
	System.out.println("Enter the starting value");
	start=f.nextInt();
	System.out.println("Enter the end value");
	finish=f.nextInt();
	System.out.print(finish);
	if(finish<start)
	{
		int temp=start;
		start=finish;
		finish=temp;
	}
	
	
	

		Document udoc=null;
	for(int i=start;i<=finish;i++)
	{
		Integer ins=new Integer(i);
		String v=ins.toString();
		 byte[] encoded = Base64.encodeBase64(v.getBytes()); 
		 
	try

{

	try{
         
		  
          udoc=Jsoup.connect("http://acoe.annauniv.edu/123finresult.php?regno="+new String(encoded)).timeout(0).get();
          // file=new File("/home/suresh/suttaresult");
           
      	 
          
         }
	catch(Exception e)
	{
		System.out.print(e);
	}
Elements ubody=udoc.select("body");
Elements utab=ubody.select("table");
Elements sub=ubody.select("td[align=center]");
Elements utd=utab.select("td");
Elements grade=utd.select("div[align=center]");
String course=sub.text();
System.out.println(course+",");
String ub=grade.text();
System.out.println(ub);

}


catch (Exception e)

{

System.out.println(e.toString());

}

}
	f.close();
	
}

}