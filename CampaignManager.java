
public class CampaignManager implements CampaignManagement {

	
	
	public void saveCampaign(Game game, double campaignPercentage) {
		
		double newPrice =  game.getPrice() - (game.getPrice() * campaignPercentage / 100);
		System.out.println("Kampanya başladı. " + game.getName() + " fiyat: " + newPrice);
	}
	
	public void deleteCampaign(Game game) {
		
		System.out.println("Kampanya dönemi bitti. Oyun fiyatı: " + game.getPrice());
	}
	
	public void updateCampaign(Game game, double oldCampaignPercentage, double newCampaignPercentage) {
		
		System.out.println("Kampanya indirim yüzdesi: " + oldCampaignPercentage +  "% 'si " + newCampaignPercentage + "%.");
		double oldPrice = game.getPrice() - (game.getPrice() * oldCampaignPercentage / 100);
		double newPrice = game.getPrice() - (game.getPrice() * newCampaignPercentage / 100);
		System.out.println("Oyun fiyatı şu fiyattan düştü: " + oldPrice + " 'den " + newPrice + "." );
	}
	
}