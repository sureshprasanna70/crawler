import org.jsoup.Jsoup;

import java.io.*;



import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;

public class mycrawler {

    public static void main(String[] args) throws IOException {
//	File file=null;



        PrintStream ps;
        ps = new PrintStream("file the output to be written");
        System.setOut(ps);
        Document udoc = null;
        try {


            udoc = Jsoup.connect("the url u want to parse").timeout(0).get();




        } catch (Exception e) {
            System.out.print(e);
        }
        Elements ubody = udoc.select("body");           //First filter:choosing the pat of html page
        Elements utab;
        utab = ubody.select("table");                    //Second filter:choosing the element   
        Elements sub = ubody.select("td[align=center]"); //Specifying the id   
        Elements utd = utab.select("td");
        Elements grade = utd.select("div[align=center]");
        String course = sub.text();
        System.out.println(course + ",");
        String ub = grade.text();

        System.out.println(ub);


    }
    
}

	
