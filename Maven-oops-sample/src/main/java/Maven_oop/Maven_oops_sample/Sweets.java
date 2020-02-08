package Maven_oop.Maven_oops_sample;
class Sweets 
{
   public int sweets_weight(int no_of_sweets,int weight_of_sweet)
   {
	   int total_weight=0;
	   total_weight=no_of_sweets*weight_of_sweet;
	   return total_weight;
   }
   public int sweets_cost(int no_of_sweets,int cost_of_sweet)
   {
	   return (no_of_sweets*cost_of_sweet);
   }
}
