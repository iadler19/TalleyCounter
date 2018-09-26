
public class TalleyCounter 
{
	//instance variables
 private int count; 

 //constructor
 public TalleyCounter()
 	{
	count = 0;
	}
 public TalleyCounter(int startNum)
 	{
	 count = startNum;
 	}
 
 public void click( )
 	{
	 count = count + 1;
	 //count++
	 //count+=1
 	}
 
 public void unclick()
 	{
	 count--;
	 //count-=1
 	}
 public void reset()
 	{
	 count = 0;
 	}
 public int getCount()
 	{ 
	 return count;
 	}
} 
 

