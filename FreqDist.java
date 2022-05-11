import java.util.Scanner;
class FreqDist
{
	public static void main(String[] args)
	{
		//Data Entries

		Scanner s=new Scanner(System.in);
		int data[]=new int[500];
		System.out.print("Enter a limit for your data (up to 500):");
		int lim=s.nextInt();
		for(int i=0;i<lim;i++)
		{
			System.out.print("Enter data entry #"+(i+1)+": ");
			data[i]=s.nextInt();
		}

		//Range & Max & Min

		int max=data[0];
		for(int i=0;i<lim;i++)
		{
			if(data[i]>max)
			{
				max=data[i];
			}
		}
		int min=data[0];
		for(int i=0;i<lim;i++)
		{
			if(data[i]<min)
			{
				min=data[i];
			}
		}
		int range=max-min;
		System.out.println("Max: "+max+"\nMin: "+min+"\nRange is: "+range);
		double LogN=Math.log10(lim);

		//Number of Classes

		double numCld=1+3.3*LogN;
		System.out.print("No. of classes are: "+numCld+"\nDo you want to round it off accordingly(Type Yes/yes to round off): ");
		String yesYes=s.next();
		int numCli;
		String yesYes2="yes";
		String yesYes3="Yes";
		numCli=(int)numCld;
		boolean decision=yesYes.equals(yesYes2);
		if(decision==false)
		decision=yesYes.equals(yesYes3);
		if(decision==true)
		{
		numCli=numCli+1;
		}
		System.out.println("Rounded off to: "+numCli);

		//Intervals
		double inter=range/numCli;
		System.out.print("Intervals are: "+inter+"\nDo you want to round it off accordingly(Type Yes/yes to round off): ");
		yesYes=s.next();
		int iinter;
		yesYes2="yes";
		yesYes3="Yes";
		iinter=(int)inter;
		decision=yesYes.equals(yesYes2);
		if(decision==false)
			decision=yesYes.equals(yesYes3);
		if(decision==true)
		{
		iinter=iinter+1;
		}
		System.out.println("Rounded off to: "+iinter);

		//Frequency Distribution

		System.out.println("Frequency Distribution, no tally marks:");
		int ll=min,ul;
		for(int i=0;i<=numCli;i++)
		{	
			int c=0;
			System.out.print(ll+"-");
			ul=ll+iinter-1;
			System.out.println(ul);
			for(int j=0;j<=lim;j++)	
			{
				
				for(int k=ll;k<=ul;k++)
				{
					if(data[j]==k)
						c=c+1;
				}
			}
			System.out.println("Freq: "+c+"\n");
			ll=ul+1;
		}	
	}
}