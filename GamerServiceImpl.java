
public class GamerServiceImpl implements GameService{

	@Override
	public void sell(Player player, Game game) {
		System.out.println(game.getName() + " satıldı ve oyuncusu " + player.getFirstName() + " " + player.getLastName());
		
	}


}
