package pooja;

class Cricketplayer
{
	int player_id;
	String player_name;
	int player_run;
	public Cricketplayer()
	{
		player_id=5;
		player_name="Ms Dhoni";
		player_run=1000;
	}
	public Cricketplayer(int player_id,String player_name,int player_run)
	{
		this.player_id=player_id;
		this.player_name=player_name;
		this.player_run=player_run;

	}
	public void player_putdata()
	{
		System.out.println("Player Id=" +player_id);
		System.out.println("Player Name=" +player_name);
		System.out.println("Player Run=" +player_run);
	}
	public static void main(String args[])
	{
		System.out.println("*****Default Player Information*****");
		Cricketplayer p=new Cricketplayer();
		p.player_putdata();
		System.out.println("*****Player Information*****");
		Cricketplayer o=new Cricketplayer(18,"virat",5000);
		o.player_putdata();
	}
}

