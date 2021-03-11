
public class Game {
	void startmsg()
	{
		System.out.println("Player A & B");
		System.out.println("A:0 & B:0");
		System.out.println("lets play!!!");
	}
	double roll_dice()
	{
		double value=(Math.floor(Math.random()*10)%6)+1;
		//System.out.println(value);
		return value;
	}
	double check()
	{
		double value=Math.floor(Math.random()*10)%3;
		/*if(value==0)
		{
			System.out.println("no play");
		}
		else if(value==1)
		{
			System.out.println("ladder");
		}
		else
		{
			System.out.println("snake");
		}*/
		return value;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("!!!! Snake & ladder Game !!!!");
		Game obj=new Game();
		obj.startmsg();

	}

}
