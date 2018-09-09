import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldCreateNewPet() {
		VirtualPet pet = new VirtualPet(100, 100, 100, 100);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldHave100Sleep() {
		VirtualPet pet = new VirtualPet(100, 100, 100, 100);
		int number = pet.sleepReturn();
		assertEquals(100, number);
	}

	@Test
	public void shouldHave100Hunger() {
		VirtualPet pet = new VirtualPet(100, 100, 100, 100);
		int number = pet.hungerReturn();
		assertEquals(100, number);
	}

	@Test
	public void shouldHave100Boredom() {
		VirtualPet pet = new VirtualPet(100, 100, 100, 100);
		int number = pet.boredomReturn();
		assertEquals(100, number);
	}

	@Test
	public void shouldHave50Thirst() {
		VirtualPet pet = new VirtualPet(100, 50, 100, 100);
		int number = pet.thirstReturn();
		assertEquals(50, number);
	}
}
