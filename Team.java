package aggregationtask;

public class Team {
	String teamName;
	Player player1;
	Player player2;
	Player player3;
	
	Team(String teamName,Player player1,Player player2,Player player3){
		this.teamName = teamName;
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
	}
	void display() {
		System.out.println("Team Name:" + teamName);
		System.out.println("Player Name:");
		System.out.println("Player Name:" + player1.playerName);
		System.out.println("Player Name:" + player2.playerName);
		System.out.println("Player Name:" + player3.playerName);
	}
	public static void main(String[] args) {
		Player p1 = new Player("Rohit Sharma");
		Player p2 = new Player("Virat Kohli");
		Player p3 = new Player("KL Rahul");
		Team t = new Team("INDIA", p1, p2, p3);
		t.display();
}
}
