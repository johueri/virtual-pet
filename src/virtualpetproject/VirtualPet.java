package virtualpetproject;

public class VirtualPet {

	// Instance Data
	private int hunger; // instance variable
	private int boredom;
	private int affection;
	private int bathroom;
	private int thirst;

	// Constructor
	public VirtualPet(int hunger, int boredom, int affection, int bathroom, int thirst) {
		this.hunger = hunger;
		this.boredom = boredom;
		this.affection = affection;
		this.bathroom = bathroom;
		this.thirst = thirst;
	}

	// Method of Behavior
	public void tick(int time) {
		hunger += time;
		boredom += time;
		affection += time;
		bathroom += time;
		thirst +=time;
	}

	public void feedPet(int food) {
		hunger -= food;
		thirst += (food/2);
	}

	public void playPet(int play) {
		boredom -= play;
	}

	public void rubPet(int rub) {
		affection -= rub;
	}

	public void letOut(int poop) {
		bathroom -= poop;
	}
	public void giveWater(int water) {
		thirst -= water;
		bathroom += (water/3);
	}
}