
public class ManagerController implements ManagementController {

	@Override
	public boolean control(Player player) {
		
	if(player.getIdentificationNumber().length() == 11 && 
			player.getFirstName().length() >= 3 && 
			player.getLastName().length() >= 2 && 
			player.getBirthYear() >= 1950) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " gerçek bir kişidir.");	
		return true;
	}
	else {
		System.out.println("Kimlik Numarası geçersiz.");
		return false;
	}
		
	}
}
