
public class PlayerServiceImpl implements PlayerService{
	
	private ManagerController managerController;
	
	public PlayerServiceImpl(ManagerController managerController) {
		this.managerController = managerController;
	}

	public void add(Player player) {
		if(managerController.control(player) == true) {
			System.out.println(player.getFirstName() + " " + player.getLastName() + " oyuncu eklendi");
		}
		else {
			System.out.println("Lütfen bilgilerinizi kontrol edin.");
		}
	}
	
	public void delete(Player player) {
		if(managerController.control(player) == true) {
			System.out.println(player.getFirstName() + " " + player.getLastName() + " dilindi.");
		}
		else {
			System.out.println("Lütfen bilgilerinizi kontrol edin.");
		}
	}
	
	public void update(Player player) {
		if(managerController.control(player) == true && player.getIdentificationNumber().length() == 11 && 
				player.getFirstName().length() >= 3 && 
				player.getLastName().length() >= 2 &&
				player.getBirthYear() > 1950) {
			
			player.setIdentificationNumber(player.getIdentificationNumber());
			player.setFirstName(player.getFirstName());
			player.setLastName(player.getLastName());
			player.setBirthYear(player.getBirthYear());
		
			System.out.println("Oyuncu bilgileri aşağıdaki gibi güncellendi: ");
			player.getIdentificationNumber();
			System.out.println();
			player.getFirstName();
			System.out.println();
			player.getLastName();
			System.out.println();
			player.getBirthYear();
		}
		else {
			System.out.println("Lütfen kimlik numaranızı veya yeni bilgilerinizi kontrol edin.");
		}
	}

}
