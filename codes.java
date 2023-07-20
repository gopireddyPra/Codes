package basic_codes;

import java.util.Scanner;

public class codes {

	public static void main(String[] args) {
		// String str="Altekk";
		Scanner scanner = new Scanner(System.in);

		/*
		 * 1.REVERSING A STRING
		 * 
		 * 
		 * char []A=str.toCharArray(); for(int i=A.length-1;i>=0;i--) {
		 * System.out.print(A[i]); }
		 */

		// 2.REVERSING A GIVEN INTEGERS

		/*
		 * System.out.println("enter a value"); Long scan=scanner.nextLong(); Long s,d;
		 * s= (long) 0; while(scan>0) { d=scan%10; s=s*10+d; scan=scan/10; }
		 * System.out.println(s);
		 */

		/*
		 * 3. FIBONNACES
		 * 
		 * 
		 * int f1=0,f2=1,f3=f1+f2; System.out.println("enter your value"); int
		 * scan=scanner.nextInt(); System.out.println(f1+f2); while(f3<scan) {
		 * System.out.println(f3); f1=f2; f2=f3; f3=f1+f2; }
		 */

		/*
		 * 4. SUM OF THE GIVEN VALUE
		 * 
		 * int s; System.out.println("enter your val"); int scan=scanner.nextInt(); s=0;
		 * for(int i=1;i<=scan;i++) { s=s+i; }
		 * System.out.println("sum of the given val = "+s);
		 */

		/*
		 * 5.FACTORIAL CODE
		 * 
		 * 
		 * int s; System.out.println("enter your val"); int scan=scanner.nextInt(); s=1;
		 * for(int i=1;i<=scan;i++) { s=s*i; }
		 * System.out.println("factorial to the given val = "+s);
		 */

		/*
		 * 6.SUM OF ALL DIGITS
		 * 
		 * 
		 * int s,d; s=0; System.out.println("enter your val"); int
		 * scan=scanner.nextInt(); while(scan>0) { d=scan%10; s=s+d; scan=scan/10;
		 * 
		 * } System.out.println("sum of the digits is ="+s);
		 */

		/*
		 * 7.MAX $ MIN VAlUE
		 *
		 * int arr[]= {1,3,46,4}; int max=arr[0]; int min=arr[0];
		 * for(inti=0;i<arr.length;i++) { if(max < arr[i]) { max=arr[i]; }
		 * 
		 * if(min >arr[i]) { min =arr[i];
		 * 
		 * }
		 * 
		 * } System.out.println("max val = "+max+"\n"+"min val = "+min);
		 */

		/*
		 * 8. FINDING DUPLICATE STRINGS
		 * 
		 * 
		 * String inputString = "pradeep"; inputString = inputString.toLowerCase(); for
		 * (int i = 0; i < inputString.length(); i++) { char currentChar
		 * =inputString.charAt(i); if (currentChar != ' ') { int count = 0; for (int j =
		 * i + 1; j < inputString.length(); j++) {
		 * 
		 * char nextChar = inputString.charAt(j); if (currentChar == nextChar) {
		 * count++; } } if (count > 0) { System.out.println("'" + currentChar +
		 * "' appeared " +(count + 1) + " times."); } } }
		 */

		// 9.FINDING DUPLICATE ELEMENTS

		/*
		 * int[] array = {1,-1,1,2};
		 * System.out.println("Duplicate elements in the array:"); for (int i = 0; i <
		 * array.length; i++) { int count =1; for (int j = i + 1; j < array.length; j++)
		 * if (array[i] == array[j]) { count++; // System.out.println(array[i]); }
		 * if(count>=0) { System.out.println(array[i]+"\tappeared   "+ (count) +
		 * "times"); } } } }
		 */

		/*
		 * 10. NEGATIVE INTEGERS MOVING ONE SIDE
		 * 
		 * int[] array = {1,-1, 2, 3, 4, 2, 5,-3};
		 * 
		 * for(int i=0;i<array.length;i++) { for(int j=i+1;j<array.length;j++) {
		 * if(array[i]>=array[j]) { int temp =array[i]; array[i]=array[j];
		 * array[j]=temp; } } } for(int i=0;i<array.length;i++) {
		 * System.out.println(array[i]); }
		 */

		/*
		 * 11. CYLICALLY ROTATE AN ARRAY BY ONE
		 * 
		 * int[] array = {1,2, 3, 4, 2, 5};
		 * System.out.println("Before cylically rotate an array by one"); for(int
		 * i=0;i<array.length;i++) { System.out.println(array[i]); } int
		 * j=array.length-1; for(int i=0;i<array.length;i++) { int temp =array[i];
		 * array[i]=array[j]; array[j]=temp; }
		 * System.out.println("after cylically rotate an array by one"); for(int
		 * i=0;i<array.length;i++) { System.out.println(array[i]);
		 * 
		 * }
		 */

		/*
		 * 12. MISSING INTEGER
		 * 
		 * 
		 * int[] array = {1,2, 4,3,5,7}; int sum =(array.length+1)*(array.length+2)/2;
		 * for(int i=0;i<array.length;i++) { sum=sum-array[i]; }
		 * System.out.println("missing integrer is = "+sum);
		 */

		/*
		 * String referenceId = "S7047W001SN1279T1626351051";
		 * 
		 * for (int i = 0; i < 10; i++) { // Get the reference ID without the last
		 * character String referenceIdWithoutLast = referenceId.substring(0,
		 * referenceId.length() - 1);
		 * 
		 * // Append the modified last digit based on the iteration String
		 * modifiedReferenceId = referenceIdWithoutLast + i;k * // Print the modified
		 * reference ID System.out.println(modifiedReferenceId); }
		 */

		/*
		 * for(int i=1;i<=30;i++) { if(i%3==0&&i%5==0) {
		 * System.out.println("three,five"); } else if(i%5==0) {
		 * System.out.println("five"); } else if(i%3==0) { System.out.println("three");
		 * } else { System.out.println(i); } }
		 * 
		 */

		/*
		 * ODD number
		 * 
		 * int n=10; for(int i=1;n>=i;i=i+2) { System.out.println(i); }
		 */
		/*
		 * ODD NUM IN DESC ORDER int n=10; n--; for(int i=1;n>=i;n=n-2) {
		 * 
		 * System.out.println(n); }
		 */

		/*
		 * Vowel Count && cons Count
		 * 
		 * 
		 * System.out.println("enter a string"); String Output=scanner.next(); int
		 * count=0; int cc=0; char[]str1=Output.toLowerCase().toCharArray(); for(int
		 * i=0;i<str1.length;i++) {
		 * if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u') {
		 * count++; }
		 * 
		 * else { cc++; } } System.out.println(count); System.out.println(cc);
		 */

		/*
		 * PRINTING ELEMENTS WITH OUT DUPLICATE ELEMENTS Using for loop
		 * 
		 * System.out.
		 * println("Enter the number of elements to read into the 'Array' array:"); int
		 * output = scanner.nextInt(); int[] a = new int[output+1];
		 * System.out.println("Enter " + output +
		 * " elements to read into the 'Array' array:"); for (int i = 0; i < output;
		 * i++) { a[i] = scanner.nextInt(); }
		 * 
		 * for (int i = 0; i < output; i++) { System.out.println(a[i]); }
		 * 
		 * for (int i = 0; i < output; i++) { for (int j = i + 1; j < output; j++) { if
		 * (a[i] > a[j]) { int temp = a[i]; a[i] = a[j]; a[j] = temp; } } }
		 * 
		 * System.out.println("without duplicate elements:"); for (int i = 0; i <
		 * output; i++) { if (a[i]!= a[i+1]) { System.out.println(a[i]); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		 * PRINTING ELEMENTS WITH OUT DUPLICATE ELEMENTS Using HASHSET
		 * 
		 * 
		 * int Array[] = new int[10];
		 * 
		 * System.out.
		 * println("Enter the number of elements to read into the 'Array' array:"); int
		 * output = scanner.nextInt(); System.out.println("Enter " + output +
		 * " elements to read into the 'Array' array:"); for (int i = 0; i < output;
		 * i++) { Array[i] = scanner.nextInt(); }
		 * 
		 * for (int i = 0; i < output; i++) { // System.out.println(Array[i]); }
		 * 
		 * HashSet<Integer> uniqueElements = new HashSet<>(); for (int i = 0; i <
		 * output; i++) { uniqueElements.add(Array[i]); }
		 * 
		 * System.out.println("Output without duplicate elements:"); for (int element :
		 * uniqueElements) { System.out.println(element); }
		 * 
		 */

		/*
		 * Stack<String> obj=new Stack<String>();
		 * System.out.println("enter  Number of strings you want to enter"); int length
		 * =scanner.nextInt();
		 * 
		 * System.out.println("enter strings"); for(int i=0;i<length;i++) { String
		 * output =scanner.next(); } for (int i = 0; i <length; i++) { obj.push(output);
		 * 
		 * }
		 * 
		 * for(String finall : obj) { System.out.println(finall); }
		 */

		int[] array = { 1, -1, 1, 2 };
		System.out.println("Occurrence of each element in the array:");

		for (int i = 0; i < array.length; i++) {
			int count = 1;
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					isDuplicate = true;
					break;

				}
			}

			if (isDuplicate) {
				continue; // Skip the duplicate element }
			}

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			System.out.println(array[i] + " appeared " + count + " times");
		}
	}

}
