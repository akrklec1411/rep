package hr.fer.oop.task3;

public class InstagramStory extends WebEntry<Story> {

	public InstagramStory(String author, String date, Story entry) {
		super(author, date, entry);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateStoryImpact(int noOfFollowers) {
		
		return	(((double)this.getEntry().getNumberOfReactions()) + this.getEntry().getNumberOfViews()) / noOfFollowers;
	}
}
