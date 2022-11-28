package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		super();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.printf("최대 등록 가능한 회원 수는 %d명입니다\n", MemberController.SIZE );
			System.out.printf("현재 등록된 회원 수는 %d명입니다.\n",mc.existMemberNum());
			if(mc.existMemberNum()<10) {
				System.out.println("1. 새 회원 등록");
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
				case 2: searchMember();break;
				case 3: updateMember();break;
				case 4: deleteMember();break;
				case 5: printAll();break;
				case 1: if(mc.existMemberNum()<10) {
					insertMember();break;
				}
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");break;
				case 9: System.out.println("프로그램을 종료합니다.");return;
			}
		}
		
	}
	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		while(mc.checkId(id)) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			String rename = sc.nextLine();
			id = rename;
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		char gender;
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine().charAt(0);
			if(gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
				break;
			}else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
		case 1: searchId();break;
		case 2: searchName();break;
		case 3: searchEmail();break;
		case 9: System.out.println("메인으로 돌아갑니다.\n");return;
		default: System.out.println("잘못 입력하셨습니다.\n");return;
		}
	}
	
	public void searchId() {
		sc.nextLine();
		System.out.print("검색할 아이디 :");
		String id = sc.nextLine();
		String result = mc.searchId(id);
		if(result != null){
			System.out.println("찾으신 회원 조회 결과입니다.\n"
										+ result+"\n");
		}else {
			System.out.println("결과가 없습니다.\n");
		}
	}
	
	public void searchName() {
		sc.nextLine();
		System.out.print("검색할 이름 :");
		String name = sc.nextLine();
		if(mc.searchName(name) != null){
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i = 0; i < mc.searchName(name).length;i++) {
				System.out.println(mc.searchName(name)[i]+"\n");
			}
		}else {
			System.out.println("결과가 없습니다\n.");
		}
	}
	
	public void searchEmail() {
		sc.nextLine();
		System.out.print("검색할 이메일 :");
		String email = sc.nextLine();
		if(mc.searchEmail(email) != null){
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(int i = 0; i < mc.searchEmail(email).length;i++) {
				System.out.println(mc.searchEmail(email)[i]+"\n");
			}
		}else {
			System.out.println("결과가 없습니다.\n");
		}
		
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일로 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
		case 1: updatePassword();break;
		case 2: updateName();break;
		case 3: updateEmail();break;
		case 9: System.out.println("메인으로 돌아갑니다.\n");return;
		default: System.out.println("잘못 입력하셨습니다.\n");return;
		}
	}
	
	public void updatePassword() {
		sc.nextLine();
		System.out.print("수정할 아이디 :");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호 :");
		String password = sc.nextLine();
		if(mc.updatePassword(id,password) == true){
			System.out.println("수정이 성공적으로 되었습니다.\n");
			return;
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n");
			return;
		}
	}
	
	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 아이디 :");
		String id = sc.nextLine();
		System.out.print("수정할 이름 :");
		String name = sc.nextLine();
		if(mc.updateName(id,name) == true){
			System.out.println("수정이 성공적으로 되었습니다.\n");
			return;
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n");
			return;
		}
	}
	
	public void updateEmail() {
		sc.nextLine();
		System.out.print("수정할 아이디 :");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 :");
		String email = sc.nextLine();
		if(mc.updateName(id,email) == true){
			System.out.println("수정이 성공적으로 되었습니다.\n");
			return;
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n");
			return;
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
		case 1: deleteOne();break;
		case 2: deleteAll();break;
		case 9: System.out.println("메인으로 돌아갑니다.\n");return;
		default: System.out.println("잘못 입력하셨습니다.\n");return;
		}
	}
	
	public void deleteOne() {
		sc.nextLine();
		System.out.print("삭제할 아이디 :");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) :");
		char ok = sc.nextLine().charAt(0);
		if(ok == 'y' || ok =='Y') {
			if(mc.delete(id) == true) {
				System.out.println("성공적으로 삭제하였습니다.\n");
			}else {
				System.out.println("존재하지 않는 아이디입니다.\n");
			}
		}
	}
	
	public void deleteAll() {
		sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) :");
		char ok = sc.nextLine().charAt(0);
		if(ok == 'y' || ok == 'Y') {
			mc.delete();
		}
	}
	
	public void printAll() {
		if(mc.existMemberNum()==0) {
			System.out.println("저장된 회원이 없습니다.\n");
		}else {
			for(Member m : mc.printAll()){
				if(m != null) {
				System.out.println(m.inform());
				}
			}
			System.out.println();
		}
		
	}
}
