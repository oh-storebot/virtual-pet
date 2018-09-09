
public class VirtualPet {

	private int hungerLevel;
	private int thirstLevel;
	private int boredomLevel;
	private int sleepLevel;

	public int hungerReturn() {
		return hungerLevel;
	}

	public int thirstReturn() {
		return thirstLevel;
	}

	public int boredomReturn() {
		return boredomLevel;
	}

	public int sleepReturn() {
		return sleepLevel;
	}

	public VirtualPet(int hunger, int thirst, int boredom, int sleep) {
		hungerLevel = hunger;
		thirstLevel = thirst;
		boredomLevel = boredom;
		sleepLevel = sleep;

	}

	public void tick() {
		hungerTick();
		thirstTick();
		boredomTick();
		sleepTick();
	}

	public void petPrint() {
		if (hungerLevel > 30 && thirstLevel > 30 && boredomLevel > 30 && sleepLevel >30) {

			System.out.println("     >=< ");
			System.out.println(",.--'  ''-.");
			System.out.println("(  )  ',_.'");
			System.out.println("Xx'xX      ");
		} else {
			System.out.println("     >=< ");
			System.out.println(",.--'  xx-. <I need something!");
			System.out.println("(  )  ',_.'");
			System.out.println("Xx'xX      ");
		}
	}

	// part of checkScenario - auto eats if too hungry
	public void autoFeed() {
		if (hungerLevel < 20 && hungerLevel < thirstLevel) {
			feed();
		}
	}

	// part of checkScenario - auto drink water
	public void autoWater() {
		if (thirstLevel < 10 && thirstLevel < hungerLevel) {
			water();
		}
	}

	// completed at the end of the loop to check if anything is occuring and calls
	// the method to initiate action
	public void checkScenarios() {
		autoFeed();
		autoWater();
	}

	// check to only allow 100 feed level
	public void overFeed() {
		feed();
		if (hungerLevel > 100) {
			hungerLevel = 100;
		}
	}

	// check to only allow 100 water level
	public void overWater() {
		water();
		if (thirstLevel > 100) {
			thirstLevel = 100;
		}
	}

	public void overPet() {
		pet();
		if (boredomLevel > 100) {
			boredomLevel = 100;
		}
	}

	public void overSleep() {
		sleep();
		if (sleepLevel > 100) {
			sleepLevel = 100;
		}
	}

	public void favFeed() {
		if (hungerLevel < 30) {
			overFeed();
			hungerLevel += 20;
			System.out.println("Your Pet's Favorite Food Bonus! +20!");
		}
		if(hungerLevel == 100) {
			overFeed();
			hungerLevel -=20;
			System.out.println("Your Pet wasn't hungry and it hates that food! -20!");
		}
	}

	public void petStatus() {
		System.out.println("Your pet is currently: ");
		System.out.println(hungerLevel + " hungry " + thirstLevel + " thirsty " + boredomLevel + " bored " + sleepLevel
				+ " sleepy");
	}

	//used to display options for each loop cycle
	public void petOptions() {
		System.out.println("1. Check your pet's currect status");
		System.out.println("2. Feed your pet");
		System.out.println("3. Water your pet");
		System.out.println("4. Pet your pet");
		System.out.println("5. Have your pet take a nap");
		System.out.println("6. Quit");

	}

	public double hungerTick() {
		return hungerLevel *= .9;
	}

	public double thirstTick() {
		return thirstLevel *= .85;
	}

	public double boredomTick() {
		return boredomLevel *= .95;
	}

	public double sleepTick() {
		return sleepLevel *= .91;
	}

	public double feed() {
		return hungerLevel *= 1.7;
	}

	public double water() {
		return thirstLevel *= 1.7;
	}

	public double pet() {
		return boredomLevel *= 1.7;
	}

	public double sleep() {
		return sleepLevel *= 1.7;
	}
}
