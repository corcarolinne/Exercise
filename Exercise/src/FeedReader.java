
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.s2018250.FeedFactory;

public class FeedReader {
	
	public static void main(String[] args) throws IOException {
		
		// creating a new feed factory
		FeedFactoryInterface factory = new FeedFactory();
    
		// saving the file name
		String file = "exercise/test.txt";
		
		// creating a buffered reader to read the file
		BufferedReader in = new BufferedReader(new FileReader(file));
    
		// creates a feed using the method from feed factory
		FeedInterface feed = factory.createFeed(in);
    
		System.out.println("=== News items ===");
		
		for(String title : feed.listTitles()) {
			System.out.println(title);
		}
	}
}
