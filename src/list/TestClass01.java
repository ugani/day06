package list;

import java.util.ArrayList;

public class TestClass01 {

	public static void main(String[] args) {
	/*
	 Collection Framework
	 -데이터 군을 저장하는 클래스들을 표준화한 설계
	 Collection
	 -자료구조
	   - 데이터를 사용하는 방식
	  Framework
	  -표준화 되어 있는 툴
	  
	  List
	  -ArrayList
	  -LinkdList
	  .....
	  -데이터의 순서가 존재한다. index를 사용 할 수 있다.
	  - 저장데이터의 중복은 허용된다.
	 */
		ArrayList<String> arr= new ArrayList<>();
		//ArrayList를 통해 문자열만 저장 할 수 있음
		//데이터 중복이 가능해서 입력된 값들을 순서대로 배열에 저장함
		//일반 배열로 저장을 하면 ex) arr[2]로 설정하면
		//						0,1,2까지 값을 고정적으로 저장 함
		//ArrayList는 입력된 만큼 저장이 가능함
		arr.add("안녕");
		arr.add("하세요");
		System.out.println("arr: "+arr);
	
		
	}

}
