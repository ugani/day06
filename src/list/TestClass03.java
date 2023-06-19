package list;

import java.util.ArrayList;

public class TestClass03 {

	public static void main(String[] args) {
		ArrayList<String>arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");

		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("없는값"));
		//contains는 arraylist에 저장되어 있는 값이면 true를 출력
		// 없는 값이라면 false를 출력해줌
		boolean bool = arr.contains("없는 값");
		System.out.println("bool :"+bool);
		//없는 값을 bool에 값을 저장해서 false를 출력하게함
	
		arr.remove(0); //index로 삭제
		//0번쨰 저장되어있는 111이라는 값을 삭제함
		System.out.println("0번째 삭제 후 값: " +arr);
		arr.remove("333");
		System.out.println("333 삭제 후 값: " +arr);
	}
	

}
