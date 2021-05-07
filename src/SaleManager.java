
public class SaleManager {
	public void sale(User user, Game game) {
		System.out.println(user.getFirstName()+" is buyied to "+game.getGameName());
	}
	public void sale(Campaign campaign, Game game) {
		double result= game.getGamePrice()-(game.getGamePrice() * campaign.getDiscount()/100);
		System.out.println(game.getGameName()+" oyunun kampanya sonrasý fiyatý: "+result);
	}
}
