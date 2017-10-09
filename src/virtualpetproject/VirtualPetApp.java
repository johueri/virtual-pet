package virtualpetproject;

import java.util.Scanner;

// Assign values to hunger and the different attributes. If hunger gets below a certain value then they are hungry. 
//
public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		VirtualPet clifford = new VirtualPet(60, 60, 60, 60, 60);
		
		System.out.println("You've been tasked with taking care of Clifford the Big Red Dog.");
		System.out.println("He's a national treasure...don't screw this up.\n");
		System.out.println(" ");
		System.out.println("Good luck. If you fail you'll be know as that guy who killed Cliford the Big Red Dog. ");
		String choice;
		
		do { 
			System.out.println("Choose and option: ");
			System.out.println("Press 1 to feed Clifford");
			System.out.println("Press 2 to play with Clifford");
			System.out.println("Press 3 to pet Clifford on his big red belly");
			System.out.println("Press 4 to let Clifford out to relieve himself and ruin someone's day.");
			System.out.println("Press 5 to let Clifford out to get a drink from a large body of water. ");
			System.out.println("Press 6 to abandon Clifford.");
			choice = input.nextLine();
			clifford.tick(1);
			
		if(choice.equals("1")) { 
			System.out.println("Clifford get's a bite to eat thanks to contributions from ten local farmers.");
			clifford.feedPet(10);
			
			
		}  else if (choice.equals("2")) {
			System.out.println("You ride Clifford's back for a short jaunt around the neighborhood.");
			System.out.println("You end up 10 miles from home in 5 minutes thanks to his large strides.");
			System.out.println(" ");
			clifford.playPet(10);
			
		}else if (choice.equals("3")) {
			System.out.println("You pet Clifford on his big red belly. He wags his tail profusely which blows the roof off of your house.");
			System.out.println(" ");
			clifford.rubPet(10);
			
			
		} else if (choice.equals("4")) {
			System.out.println("Clifford goes outside to relieve himself. Poop and pee are everywhere...");
			System.out.println("EVERYWHERE!!");
			System.out.println(" ");
			clifford.letOut(10);
			
		}else if (choice.equals("5")) {
			System.out.println("Clifford gives you a ride to the pond and he drinks 10% of its volume.");
			System.out.println("The environmentalist in you dies a little with each massive gulp. ");
			System.out.println(" ");
			clifford.giveWater(10);
			
		}else if (choice.equals("6")) {
			System.out.println("You didn't have any business owning a large animal anyway.");
			System.out.println("Your neighborhood association is actively looking to get you evicted.");
			System.out.println("And there is SO MUCH POOP. What were you thinking?! Just go to bed.");
			System.out.println("Good bye.");
			break;
		}
		System.out.println("What else would you like to do?");
		System.out.println(" ");
	
		
		}while (!choice.equals("6"));
		
		}
		
		
	
}
	