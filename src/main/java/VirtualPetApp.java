import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Virtual Pet!");

		VirtualPet pet = new VirtualPet(100, 100, 100, 100);
		pet.petPrint();
		pet.petStatus();
		pet.petOptions();

		Scanner input = new Scanner(System.in);
		String menuOption = input.nextLine();

		while (!menuOption.equals("6")) {
			if (menuOption.equals("1")) {
				pet.petPrint();
				pet.petStatus();
				pet.petOptions();
				pet.tick();

			} else if (menuOption.equals("2")) {

				pet.petPrint();
				pet.favFeed();
				pet.overFeed();
				pet.petStatus();
				pet.petOptions();
				pet.tick();

			} else if (menuOption.equals("3")) {
				pet.petPrint();
				pet.overWater();
				pet.petStatus();
				pet.petOptions();
				pet.tick();

			} else if (menuOption.equals("4")) {
				pet.petPrint();
				pet.overPet();
				pet.petStatus();
				pet.petOptions();
				pet.tick();

			} else if (menuOption.equals("5")) {
				pet.petPrint();
				pet.overSleep();
				pet.petStatus();
				pet.petOptions();
				// no tick. does not get hunrgy, thirsty or bored while sleeping. this is intentional
			}

			pet.checkScenarios();
			menuOption = input.nextLine();

		}
		System.out.println("Your pet looks forward to seeing you again");
	}
}
