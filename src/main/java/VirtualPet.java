
public class VirtualPet {

	private double hungerLevel;
	private double thirstLevel;
	private double boredomLevel;
	
	public VirtualPet(double hunger, double thirst, double boredom) {
		hungerLevel = hunger;
		thirstLevel = thirst;
		boredomLevel = boredom;
		
	}
	
	public void tick() {
		hungerTick();
		thirstTick();
		boredomTick();
	}
	public void petPrint() {
		System.out.println("     >=< ");
		System.out.println(",.--'  ''-.");
		System.out.println("(  )  ',_.'");
		System.out.println("Xx'xX      ");
		
	}
	
	public void petStatus() {
		System.out.println("Your pet is currently: ");
		System.out.println(hungerLevel + " hungry " + thirstLevel + " thirsty " + boredomLevel + " bored");
	}
	
	public void petOptions() {
		System.out.println("1. Check your pet's currect status");
		System.out.println("2. Feed your pet");
		System.out.println("3. Water your pet");
		System.out.println("4. Pet your pet");

	}
	public double hungerTick() {
		return hungerLevel *= .9;
	}
	
	public double thirstTick() {
		return thirstLevel *= .8;
	}
	
	public double boredomTick() {
		return boredomLevel *=.7;
	}
	
	public double feed() {
		return hungerLevel *=2.0;
	}
	
	public double water() {
		return thirstLevel *=2.0;
	}
	
	public double pet() {
		return boredomLevel *=2.0;
	}
}
