import java.util.Scanner;

public class App {
	public static void main(String [] args) {
		
		String q1 ="What color are apples?\n"
					+"(a)red/green\n(b)Orange\n(c)Magenta\n";
		
		String q2 ="What color are bananas?\n"
					+"(a)red/green\n(b)Yellow\n(c)Blue\n";
		
		//Created an array using Question class as data type and questions as array name
		Question [] questions = {
				new Question(q1, "a"),
				new Question(q2, "b")
		};
		takeTest(questions); //calling the method
		
	}
	//Creating a method and getting one parameter using a array Question
			public static void takeTest(Question [] questions) {
				int score = 0; //to keep track of score
				//now going to ask questions using a for loop
				
				Scanner keyboardInput = new Scanner(System.in); //scanner to get input from user
				
				for(int i=0; i < questions.length; i++) {
					//inside this loop, we're going to ask users questions & get their answers
					//and check answers to see if they're right
					System.out.println(questions[i].prompt); //in each iteration, we're accessing a different question
					String answer = keyboardInput.nextLine(); //save the input in answer variable
					//compare the answers with correct answers
					if(answer.equals(questions[i].answer)) {
						score++;
					}
					
				}
				System.out.println("You got"+ score + "/" +questions.length); //total number of questions = .length
			
			}
}
