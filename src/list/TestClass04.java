package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass04 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			//반복문을 통해 배열에 저장할 값들을 i가 2가 될때 까지 0,1,2를 
			//입력 후 반복문이 끝나면서
			System.out.println(i+ ".번째 입력 :");
			String msg = input.next();
			arr.add(msg);
			//arr.add(input.next() );
		}
		//0~2까지 배열에 입력된 값들이 출력됨
		System.out.println("arr : "+arr);
		System.out.println("찾는 값 입력: ");
		String search = input.next();
		System.out.println("contains : " +arr.contains(search));
		//contains는 찾는 값이 있으면 트루 없으면 펄스를 출력함
		System.out.println("indexOf : " +arr.indexOf(search));
		//indexOf는 찾는 값이 있으면 그 index값을 출력해줌, 없으면 -1을 출력
	}

}
