package ie.cct.objectorientedconstructs.s2018250;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public class Feed implements FeedInterface {
	
	// properties
	private List<FeedItem> feedItemsList;
	
	//constructor
	public Feed(List<FeedItem> feedItemsList) {
		this.feedItemsList = feedItemsList;
	}
	
	// method to list titles of the feed items
	@Override
	public Collection<String> listTitles() {
		// creating a list to save the titles
		List<String> titlesList = new ArrayList<String>();
		
		for(int i = 0; i < feedItemsList.size(); i++) {
			// accessing title of feed item and saving into a variable
			String title = this.feedItemsList.get(i).title;
			
			// adding this variable to the list
			titlesList.add(title);
		}
		
		return titlesList;
		
	}

	// method to get items with a given title
	@Override
	public FeedItem getItem(String title) {
		// loop through list
		for (int i = 0; i < feedItemsList.size(); i++) {
			// if list contain feed items with the given title
			if(this.feedItemsList.contains(title)) {
				// return the feed
				return feedItemsList.get(i);	
			} else {
				return null;
			}
		}
		return null;
	}

	// count number of items in the feed list
	@Override
	public int numItems() {
		// the feed Items list it's an array list, therefore we can use the build in method size
		return feedItemsList.size();
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		// loop through list
		for (int i = 0; i < feedItemsList.size(); i++) {
			// if list contain feed items with the given title
			if(this.feedItemsList.contains(keyword)) {
				// return the feed
				return feedItemsList;	
			} else {
				return null;
			}
		}
		return null;
	}

}
