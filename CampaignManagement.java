
public interface CampaignManagement {
	
	void saveCampaign(Game game, double campaignPercentage);
	void deleteCampaign(Game game);
	void updateCampaign(Game game, double oldCampaignPercentage, double newCampaignPercentage);

}
