package main;

import java.util.ArrayList;

public class TaggedImage 
{
	private ArrayList<String> tags;
	private String url = "invalid";
	public TaggedImage(ArrayList<String> tags, String url)
	{
		this.tags = tags;
		this.url = url;
	}
	
	ArrayList<String> returnTags()
	{
		return this.tags;
	}
	String returnUrl()
	{
		return this.url;
	}
	
	double tagAccuracy(ArrayList<String> otherTags)
	{
		int matches = 0;
		for(int i = 0; i < this.tags.size(); i++)
		{
			for(int k = 0; k < otherTags.size(); k++)
			{
				if (this.tags.get(i).equals(otherTags.get(k)))
				{
					matches++;
					otherTags.remove(k);
					k--;
				}
				if(otherTags.size() == 0)
					break;
			}
		}
		if(otherTags.size() > 0)
			return 0;
		else
			return matches/this.tags.size();
	}
}
