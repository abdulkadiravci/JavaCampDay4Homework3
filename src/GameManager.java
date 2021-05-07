
public class GameManager {

	public void saleGame(User user, Game game) {
		System.out.println(game.getGameName()+" is saled for "+user.getFirstName()+user.getLastName());
	}
	public void deleteGame(User user, Game game) {
		System.out.println(game.getGameName()+" is deleted for "+user.getFirstName()+user.getLastName());
	}
	public void updateGamePrice(Game game, User user) {
		System.out.println(game.getGameName()+"'s price is updated");
	}
}
