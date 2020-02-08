package Maven_oop.Maven_oops_sample;
import java.util.Scanner;
public class NewYear_Gift extends Sweets implements Chocolate
{
     public int weight_chocolates(int no_chocolates,int weight)
	{
		return (no_chocolates*weight);
	}
    public int cost_chocolate(int no_of_chocolates,int weight)
    {
    	return no_of_chocolates*weight;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number of gifts:");
    	int n=sc.nextInt();
    	int[] ar=new int[n+1];
    	String[] a=new String[n+1];
    	for(int gifts=1;gifts<=n;gifts++)
    	{
    		System.out.println("Details regarding gift "+gifts);
    		Chocolate choco=new NewYear_Gift();
    		System.out.println("Enter Candy type:");
    		String candy=sc.next();
    		a[gifts]=candy;
    		System.out.println("Enter Number of candies , Weight of each candy and cost");
    		int num_candies=sc.nextInt();
    		int cost_candy=sc.nextInt();
    		int  weight_candy=sc.nextInt();
    		Sweets sweets=new Sweets();
    		System.out.println("Enter sweet recepie:");
    		String sweet=sc.next();
    		System.out.println("Enter number of sweets,weight of sweet and its cost");
    		int num_sweets=sc.nextInt();
    		int weight_sweet=sc.nextInt();
    		int cost_sweet=sc.nextInt();
    		System.out.println("Candies are of type:"+candy+" Total weight:"+choco.weight_chocolates(num_candies, weight_candy)+" Total cost:"+choco.cost_chocolate(num_candies, cost_candy));
    		ar[gifts]=choco.weight_chocolates(num_candies, weight_candy);
    		System.out.println("Sweets are of type:"+sweet+" Total weight:"+sweets.sweets_weight(num_sweets, weight_sweet)+" Total cost:"+sweets.sweets_cost(num_sweets, cost_sweet));
    		
    	}
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=i;j<=n;j++)
    		{
    			if(ar[j]<ar[i])
    			{
    				int tmp=ar[j];
    				ar[j]=ar[i];
    				ar[i]=tmp;
    				String st=a[i];
    				a[i]=a[j];
    				a[j]=st;
    			}
    		}
    	}
    	System.out.println("Printing candies in inreasing order of thier weights");
    	for(int i=1;i<=n;i++)
    	{
    		System.out.println(a[i]+" : "+ar[i]);
    	}
    }
}

