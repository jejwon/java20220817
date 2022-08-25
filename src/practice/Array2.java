package practice;

public class Array2 {
	public static void main(String[] args) {
	
	}
	
	int[] sum67 = new int[] {2, 7, 6, 2, 6, 7, 2, 7};
	public int sum67(int[] nums) {
		  
		  int sum = 0;
		  boolean stop = false;
		  
		  for(int num : nums) {
		   if (num == 6) {
		     stop = true;
		   }
		   
		   if (!stop) {
		     sum += num;
		   }
		   
		   if (num == 7) {
		     stop = false;
		   }
		    
		  }
		  return sum;
		}	
	
	
}
