package ie.cct.objectorientedconstructs.s2018250;

import java.util.ArrayList;
import java.util.Collection;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public class Feed implements FeedInterface {
	
	// properties
	private ArrayList<FeedInterface> feedItemsList;
	
	//constructor
	public Feed(ArrayList<FeedInterface> feedItemsList) {
		this.feedItemsList = feedItemsList;
	}
	
	@Override
	public Collection<String> listTitles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
