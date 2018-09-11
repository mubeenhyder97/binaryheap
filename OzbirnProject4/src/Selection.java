// Project 4 by Mubeen Hyder
/* Solve the "Selection Problem" described in the chapter 6 slides
     using Algorithm 2 (slide 31).
     
     You may use the BinaryHeap class from the textbook.

     Your program should take a command-line parameter for specifying
     which item to find, for example, 3 means find the 3rd largest.

     Name your class Selection.
  
     Include a main method which demonstrates that your algorithm works.
     
*/

// The Selection Problem:  find the kth largest element.
/* Algorithm 2: 
 * Sort first k elements.  
 * For each remaining element, 
 * insert it into proper position in list if larger than kth element
*/

public class Selection {
	
	public static int findKthLargest(int[] array, int k) throws Exception
	{
		Integer x[] = new Integer[k]; 
		
		// this is the work on what the algorithm has called "first k elements" 
		for(int i=0;i<k;i++) 
		{

			x[i]=array[i]; //formatting the arrays 
		
		}
		
		BinaryHeap<Integer> heap=new BinaryHeap<Integer>(x); // creating a binary heap 
		
		
		// this is..."for each remaining element" 
		for(int i=k;i<array.length;i++) 
		{
			if(array[i]>heap.findMin()) //insert it into proper position in list if larger than kth element
			{
				heap.deleteMin(); 
				heap.insert(array[i]); 

			}

		}
		
		return heap.findMin();
	}
	
}
