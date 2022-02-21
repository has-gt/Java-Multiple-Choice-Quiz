
public class App {
	public static void main(String []args) {
		Movie movie1 = new Movie("Avengers", "Joss Whedon", "PG-13"); //Object movie1
		Movie movie2 = new Movie("Step Brothers", "Adam McKay", "R"); //Object movie2
		 
		//movie1.rating = "Dog"; //we can't give a value directly because rating attribute is set to private
		movie1.setRating("Dog"); //Outputs NR because Dog is not a valid rating
		movie2.setRating("PG-13");
		
		//System.out.println(movie2.rating); //we can't access rating directly because it's private, we need a getter for that
		System.out.println(movie1.getRating());
	}
}
