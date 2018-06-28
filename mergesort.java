// Writing an Implementation of Mergesort
// Copying psuedocode from https://en.wikipedia.org/wiki/Merge_sort

import java.awt.Rectangle;

public class MergeSort
{	
  public static void main(String[] args)
	{	go();
	}
	
	public static void go()
	{	
	}
	
	public static void alterPointee(Rectangle r)
	{	System.out.println("In method alterPointee. r " + r + "\n");
		r.setSize(20, 30);
		System.out.println("In method alterPointee. r " + r + "\n");
	}
	
	public static void alterPointer(Rectangle r)
	{	System.out.println("In method alterPointer. r " + r + "\n");
		r = new Rectangle(5, 10, 30, 35);
		System.out.println("In method alterPointer. r " + r + "\n");
	}
	
	
}
