package list;

import java.util.ArrayList;

import javax.annotation.processing.SupportedSourceVersion;

public class TestClass02 {

	public static void main(String[] args) {
		ArrayList <String> arr = new ArrayList<>();
		System.out.println(arr.size());
		//배열에서는 length로 길이 확인
		//ArrayList는 size를 사용
		arr.add("111");
		arr.add("222");
		arr.add("333");
		String s = arr.get(0);
		//get을 통해 0번째 저장되어 있는 값을 가져 올 수 있음
		System.out.println("0 :" +s);
		System.out.println("------------------------");
		for(int i=0; i<arr.size(); i++) {
			s = arr.get(i);
			System.out.println(s);
//			위의 결과와 같이 나옴 System.out.println(arr.get(i));	
		}
		System.out.println("----- for each -----");
		for(String ss : arr) {
			System.out.println(ss);
		}

	}

}
