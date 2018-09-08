import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Virtual Pet!");
		
		VirtualPet pet = new VirtualPet(100,100,100);
		pet.petPrint();
		pet.petStatus();
		pet.petOptions();
		
		Scanner input = new Scanner(System.in);
		String menuOption = input.nextLine();

		while(!menuOption.equals("5")) {
			if(menuOption.equals("1")) {
				pet.petStatus();
				pet.petOptions();
				pet.tick();

			}else if(menuOption.equals("2")) {
				pet.feed();
				pet.petStatus();
				pet.petOptions();
				pet.tick();
			
			} else if (menuOption.equals("3")){
				pet.water();
				pet.petStatus();
				pet.petOptions();
				pet.tick();
			}else if (menuOption.equals("4")){
				pet.pet();
				pet.petStatus();
				pet.petOptions();
				pet.tick();
			}
				menuOption = input.nextLine();
	
	}
}
}
