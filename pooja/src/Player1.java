import java.util.Scanner.*;
class player_record
{
	int player_id;
	String player_name;
	int player_run;
	public player_record()
	{
		player_id=5;
		player_name="Ms Dhoni";
		player_run=1000;
	}
	public player_record(int player_id,String player_name,int player_run)
	{
		this.player_id=player_id;
		this.player_name=player_name;
		this.player_run=player_run;

	}
	public void player_putdata()
	{
		System.out.println("Player Id" +player_id);
		System.out.println("Player Name" +player_name);
		System.out.println("Player Run" +player_run);
	}
	public static void main(String args[])
	{
		System.out.println("*****Default Player Information*****");
		player_record p=new player_record();
		p.player_putdata();
		System.out.println("*****Player Information*****");
		player_record o=new player_record(18,"virat",5000);
		o.player_putdata();
	}
}