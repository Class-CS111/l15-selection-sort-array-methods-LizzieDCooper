/********************************************
*	AUTHOR:	Lizzie Cooper
* COLLABORATORS: N/a
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	4/8/25
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    int[] values = {12, 16, 26, 42, 53, 77, 84};
    System.out.println(ArrayMethods.arrayString(values));

    ArrayMethods.swap(values, 0, 6);
    System.out.println(ArrayMethods.arrayString(values));

    int[] numbers = {42, 16, 84, 12, 77, 26, 53};
    int minIndex1 = ArrayMethods.indexOfMin(numbers, 0);
    int minIndex2 = ArrayMethods.indexOfMin(numbers, 4);
    System.out.println(minIndex1 + " and " + minIndex2);

    ArrayMethods.reverse(numbers);
    System.out.println(ArrayMethods.arrayString(numbers));
    
    ArrayMethods.selectionSort(numbers);
    System.out.println(ArrayMethods.arrayString(numbers));
  }
}