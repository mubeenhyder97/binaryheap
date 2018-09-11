import java.util.Scanner; 

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// here we will declare our array 
		int arr [] = {4598, 5679, 3231, 9457, 2822, 3457, 6371, 8743}; 
		
		Scanner s = new Scanner(System.in); 
		int choice = 100; 
		
		while(choice!=2)
		{
	    // menu 
		System.out.println("Project 4: by Mubeen Hyder");
		System.out.println("1) Run "); 
		System.out.println("2) Exit "); 
		System.out.println();
		System.out.println("please make a choice:");
		choice = s.nextInt(); 
		if(choice == 1)
		{
			System.out.println("Enter k:"); 
			int k = s.nextInt(); 
			if(k > arr.length) // bounds checking
			{
				System.out.println("invalid k size! "); 
				System.out.println("try again!");
			}
		
			
			if(k<= arr.length)
			System.out.println(Selection.findKthLargest(arr, k)); 
		}
		
		if(choice > 2)
		{
			System.out.println("invalid selection...please try again");
		}
		
		
		System.out.println(); 
	}

}

}