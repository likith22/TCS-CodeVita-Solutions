/*Given text comprising of words and numbers, sort them both in ascending order and print them in a manner that a word is followed by a number. Words can be in upper or lower case. You have to convert them into lowercase and then sort and print them.
Input Format:
First line contains total number of test cases, denoted by N
Next N lines, each contains a text in which words are at odd position and numbers are at even position and are delimited by space
Output Format:
Words and numbers sorted in ascending order and printed in a manner that a word is followed by a number.
Constraints:
1. Text starts with a word
2. Count of words and numbers are the same.
3. Duplicate elements are not allowed 
4. Words should be printed in lower case. 
5. No special characters allowed in text.
Solution in Java :-*/
package tcsCodeVita;
//completed!
import java.util.Scanner;
import java.util.TreeSet;
public class AlphaNumericSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int j = 0;j < testCases; j++) {
			String str = sc.nextLine();
			String strArr[] = str.split(" ");
			TreeSet<String> set1 = new TreeSet<>();
			TreeSet<Integer> set2 = new TreeSet<>();
			for(int i = 0;i < strArr.length;i++) {
				if(i%2 == 0) {
					set1.add(strArr[i]);
				}
				else {
					set2.add(Integer.parseInt(strArr[i]));
				}
			}
			String[] arr1 = set1.toArray(new String[set1.size()]);
			Integer[] arr2 = set2.toArray(new Integer[set2.size()]);
			for(int i = 0;i < arr1.length && i< arr2.length;i++) {
				System.out.print(arr1[i] + " "+ arr2[i]+ " ");
			}
		}
		sc.close();
	}

}
