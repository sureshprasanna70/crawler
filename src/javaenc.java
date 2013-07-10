
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class javaenc {
	public static void main(String arg[])
	{
		Document udoc=null;
		try{
	         
			  
	          udoc=Jsoup.parse("www.stardeveloper.com/articles/display.html?article=2001072001&page=1");
	          // file=new File("/home/suresh/suttaresult");
	           
	      	 
	          
	         }
		catch(Exception e)
		{
			System.out.print(e);
		}
	Elements ubody=udoc.select("body");
	String us=ubody.text();
	System.out.println(us);

	}
    //decoding byte array into base64
    



	}

