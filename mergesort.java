```java
~~not yet done~~
// Writing an Implementation of Mergesort
// Copying psuedocode from https://en.wikipedia.org/wiki/Merge_sort

import java.util.*;

public class MergeSort
{	
  	public static void main(String[] args)
	{	int[] arr = {0, 0, 0, 1000, 4, 36, 21, 98, 61, 44, 38};
	  	int[] sortedarr = msort(arr);
	 	System.out.println(Arrays.toString(arr));
	 	System.out.println(Arrays.toString(sortedarr));
	 	int[] arr2 = {3, 4, 5, 2, 16, 1, 35, 21, 20, 70, 10};
	 	System.out.println(Arrays.toString(arr2));
	 	System.out.println(Arrays.toString(msort(arr2)));
	}
	
	public static int[] msort(int[] arr)
	{	int[] bar = new int[arr.size];
		copyArray(arr, bar);
	 	splitMerge(bar, 0, arr.size, arr);
	}
	
	public static int[] copyArray(int[] a, int[] b)
	{	if(a.size == b.size)(
		{	for(int i =0; i < a.size; i++)
			{	b[i] = a[i];
			}
		}
	}
	
	public static void splitMerge(int[] b, int start, int end, int[] a)
	{	if(end - start >= 2)
		{	int middle  = (start+end)/2;
		 	splitMerge(a, start, middle, b);
		 	splitMerge(a, middle, end, b);
		 	merge(b, start, middle, end, a);
		}	
	}
	
	public static void merge(int[] a, int start, int middle, int end, int[] b)
	{	int i = start
	}		
}
```
