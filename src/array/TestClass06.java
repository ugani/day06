package array;

import java.util.Scanner;

public class TestClass06 {

	public static void main(String[] args) {
		int arr[] = {10,54,13,17,25,30};
		String hj = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("짝, 홀 입력 :");
		hj = sc.next();
		for(int i=0; i<arr.length; i++) {
			if(hj.equals("짝")) {
				if(arr[i]%2 == 0) {
					System.out.println(arr[i]);
				}
			}else {
				if(arr[i]%2 != 0) {
					System.out.println(arr[i]);
				}
			}
		}
		
		
		
	}

}
