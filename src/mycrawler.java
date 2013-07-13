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
       PrintStream ps;
        ps = new PrintStream("sample.txt");
        System.setOut(ps);
        

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
	/*for(int i=start;i<=finish;i++)
	{
		Integer ins=nehttp://acoe.annauniv.edu/123finresult.php?regno="+new String(encoded)w Integer(i);
		String v=ins.toString();
		 byte[] encoded = Base64.encodeBase64(v.getBytes()); 
		 
	try

{*/

	try{
         
		  
          udoc=Jsoup.connect("http://www.annauniv.edu/tnea2013/").timeout(0).get();
          // file=new File("/home/suresh/suttaresult");
           
      	 
          
         }
	catch(Exception e)
	{
		System.out.print(e);
	}
Elements ubody=udoc.select("body");
Elements utab;
    utab = ubody.select("table");
Elements sub=ubody.select("td[align=center]");
Elements utd=utab.select("td");
Elements grade=utd.select("div[align=center]");
String course=sub.text();
System.out.println(course+",");
String ub=grade.text();

System.out.println("2"+ub);


}


/*catch (Exception e)

{

System.out.println(e.toString());

}*/

}

	
/*}
}*/