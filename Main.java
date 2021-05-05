
public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1,"11111111111", "Ali", "Can", 1999);

		System.out.println(player.getFirstName());
		
		ManagerController controlManager = new ManagerController();

		PlayerServiceImpl playerService = new PlayerServiceImpl(controlManager);
		playerService.add(player);
		playerService.delete(player);
		playerService.update(player);
		
		Game game = new Game("1","PubG", "2018", "PubG", 20);
		
		GamerServiceImpl gameService = new GamerServiceImpl();
		gameService.sell(player, game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.saveCampaign(game, 10);
		campaignManager.deleteCampaign(game);
		campaignManager.updateCampaign(game, 10, 15);
	}

}
