import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		TCKimlikDogrulama sorgu=new TCKimlikDogrulama("12345678910", "Recep", "Aksakaloðlu", 2002);
		Game game=new Game(1, "PES 2021", 200);
		User user=new User(1, "Recep", "Aksakaloðlu", "recep.aksakaloglu@gmail.com", "14725836914", 2002);
		Campaign campaign=new Campaign(1, "Süper Yaz", 14, 20);
		GameManager gameManager=new GameManager();
		SaleManager saleManager=new SaleManager();
		
		
		gameManager.saleGame(user, game);
		gameManager.deleteGame(user, game);
		gameManager.updateGamePrice(game, user);
		
		saleManager.sale(campaign, game);
		saleManager.sale(campaign, game);
		
	}

}
