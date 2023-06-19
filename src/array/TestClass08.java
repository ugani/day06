package array;

import java.util.Scanner;

public class TestClass08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		int num=0, i=0;
		String scid=null , scpwd=null;
		while(true) {
			System.out.println("1. 로그인 ");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원 보기");
			System.out.println("4. 나가기");
			
			System.out.print("메뉴 선택: ");
			num = sc.nextInt();
		switch(num) {
		case 1:
			if(id.length==0) {
				System.out.println("회원가입 먼저 진행하세요");
				break;
			}
			System.out.print("id 입력 : ");
			scid = sc.next();
			System.out.print("pwd 입력: ");
			scpwd = sc.next();
			for(i=0; i<id.length; i++) {
				if(scid.equals(id[i])) {
					if(scpwd.equals(id[i])) {
						System.out.println("로그인 성공!");
					}else {
						System.out.println("비밀번호가 틀렸자너");
					}break;
				}
			}
			if(i == id.length) {
				System.out.println("존재하지 않은 아이디여,,");
				
			}
			break;
		case 2:
			if(id[id.length-1] != null) {
				System.out.println("저장 공간이 없습니다!!");
				break;
			}
			while(true) {
				System.out.print("가입할 아이디 입력: ");
				scid = sc.next();
				for(i=0; i<id.length; i++) {
					if(scid.equals(id[i])) {
						break;
					}else if(id[i] == null) {
						break;
					}
				}
				if(id[i]==null){
					break;
				}
				System.out.println("존재하지 않은 id여");
				System.out.println("다시 입력해!");
			}
			System.out.print("pwd 입력: ");
			scpwd = sc.next();
			id[i] = scid;
			pwd[i] = scpwd;
			System.out.println("등록이 완료되었음");
			break;
		case 3:
			if(id[i] == null) {
				System.out.println("저장된 정보가 없습니다");
				break;
			}
			System.out.println("id\tpassword");
			System.out.println("----------------");
			for(i=0 ; id[i] != null ; i++) {
				System.out.println(id[i]+"\t"+pwd[i]);
				if(i == id.length-1)
					break;
			}
			System.out.println("----------------");
			break;
		default: System.out.println("잘못입력..");
		case 4:
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
	
			
		}
		
		}
		
		
		

	}

}
