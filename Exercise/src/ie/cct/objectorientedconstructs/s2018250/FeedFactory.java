package ie.cct.objectorientedconstructs.s2018250;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public class FeedFactory implements FeedFactoryInterface {

	// creating a list to save the feed items
	List<FeedItem> feedItemsList = new ArrayList<FeedItem>();

	// method to create feeds and feed items
	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {
		
		// variable to keep count of the articles
		int counter = 0;
		
		// this loop will loop through all the feed items in the file (and there's 3)
		while(counter < 3) {
			
			// reading title and content from the file
			String title = in.readLine();
			String content = in.readLine();
			
			// creating a new feed item with the contents from file
			//  include these feed items on the feed list
			feedItemsList.add(new FeedItem(title, content));
			
			// incrementing counter
			counter++;
		}
		
		// creating an instance of the feed passing a feedList
		Feed feed = new Feed(feedItemsList); 
		
		return feed;
	}

}
