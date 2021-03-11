
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
	
	void play()
	{
		int temp=1;
		int Asteps=0,Bsteps=0;
		double ACount=0,BCount=0;
		while(ACount<100 && BCount<100)
		{
			if(temp==1)
			{
				double dice_value=roll_dice();
				double step_option=check();
				if(step_option==0)
				{
					ACount=ACount+0;
					System.out.println("A no play "+ACount);
				}
				if(step_option==1)
				{
					ACount=ACount+dice_value;
					if(ACount>100)
					{
						ACount=ACount-dice_value;
					}
					System.out.println("A climb ladder "+ACount);
				}
				if(step_option==2)
				{
					if(ACount>dice_value)
						ACount=ACount-dice_value;
					else
						ACount=0;
					System.out.println("A degraded by snake "+ACount);
				}
				Asteps=Asteps+1;
				temp=temp+1;
			}
			if(temp==2)
			{
				double dice_value=roll_dice();
				double step_option=check();
				if(step_option==0)
				{
					BCount=BCount+0;
					System.out.println("B no play "+BCount);
				}
				if(step_option==1)
				{
					BCount=BCount+dice_value;
					if(BCount>100)
					{
						BCount=BCount-dice_value;
					}
					System.out.println("B climb ladder "+BCount);
				}
				if(step_option==2)
				{
					if(BCount>dice_value)
						BCount=BCount-dice_value;
					else
						BCount=0;
					System.out.println("B degraded by snake "+BCount);
				}
				Bsteps=Bsteps+1;
				temp=temp-1;
			}
		}
		if(ACount==100)
		{
			System.out.println("A wins!!!!   stpes:"+Asteps);
			System.out.println("B better luck next time");
		}
		else
		{
			System.out.println("B wins!!!!   steps:"+Bsteps);
			System.out.println("A better luck next time");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("!!!! Snake & ladder Game !!!!");
		Game obj=new Game();
		obj.startmsg();
		obj.play();

	}
	

}
