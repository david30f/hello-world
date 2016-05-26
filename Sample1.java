import java.util.Scanner;

public class Sample1 {
	public static void main (String [] args) {
		System.out.println("pick a superhero:");
		System.out.println("a. Deadpool");
		System.out.println("b. Captain America");
		System.out.println("c. Iron Man");
		
		Scanner scanInput = new Scanner (System.in);
		String scannedString = scanInput.next();
		char chosenLetterofHero = scannedString.charAt(0);
		System.out.println("Your choice is " + chosenLetterofHero);
		System.out.println("You're about to fight Ultron.");
		
		int ultronHP = 100;
		while (ultronHP > 0) {
			System.out.println("Press any key to attack");
			scannedString = scanInput.next();
			switch(chosenLetterofHero) {
				case 'a':
					Deadpool deadpoolChar = new Deadpool();
					break;
				case 'b':
					CaptAmerica captAmericaChar = new CaptAmerica();
					break;
				case 'c':
					IronMan ironManChar = new IronMan();					
			}
			ultronHP -= 10;
			System.out.println("Ultron's hp is down to " + ultronHP);
		}
		System.out.println("Ultron is dead. Congratulations");
	}
} 