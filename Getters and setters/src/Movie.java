//movie class
public class Movie {
	private String title;
	private String director;
	private String rating; //rating attribute can only be accessed by 'movie' class
	
	//constructor Movie
	public Movie(String title, String director, String rating){
		this.title = title;
		this.setDirector(director); //using setter inside constructor
		this.rating = rating;
	}
	//A setter is used to modify the 'ratings' attribute to accept only rating values
	
	//creating a new method inside the class
	//creating a method that the user can use to give a value to this rating attribute
	public void setRating(String rating) {
		if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR")) {
			this.rating = rating; //check whether rating is equal to any of the valid ratings
		}else {
			this.rating = "NR"; //if not "NR"(Not rated)
		}
	}
	//creating the getter for rating
	public String getRating() {
		return rating;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDirector() {
		return this.director;
	}

}
