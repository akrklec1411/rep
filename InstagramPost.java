package hr.fer.oop.task3;

public class InstagramPost<T extends Post> extends WebEntry<T>{

	public InstagramPost(String author, String date, T entry) {
		super(author, date, entry);
		// TODO Auto-generated constructor stub
	}
	
	public double calculatePostImpact(int noOfLikes) {
		return ((double)this.getEntry().getNumberOfLikes())/noOfLikes;
	}
	
	public static void main(String[] args) {
		Image i1 = new Image(249, "caption1");
		Video v1 = new Video(20, 500, 150, "caption");
		Story s1 = new Story(102, 3);

		InstagramPost<Post> igPost = new InstagramPost<>("user", "17.4.2021", i1);
		System.out.println(igPost.calculatePostImpact(500));

		InstagramStory igStory = new InstagramStory("user2", "18.4.2021", s1);
		System.out.println(igStory.calculateStoryImpact(430));

		v1.printPostData();
	}
	
}
