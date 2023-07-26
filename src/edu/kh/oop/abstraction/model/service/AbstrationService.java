package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비지니스 로직)을 제공하는 클래스
public class AbstrationService {
	
	public void ex1() {
		//국민 객체 만들기
		People p1 = new People();
		//People p1 : people 객체의 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 people 객체를 Heap영역에 생성
		
		//**클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형"이라고도 한다!!**
		
		//p1.name = "홍길동";
		p1.setName("홍길동");
		
		p1.setAge  (25);
		p1.setGender  ('남');
		p1.setPhone  ("010-1234-5678")	;
		p1.setpNo  ("200303-1234567");
		p1.setaddress = ("서울시 중구 남대문로 120 대일빌딩 3중 E강의장");
		System.out.println("p1의name : "+ p1.getName());
		System.out.println("p1의age : "+ p1.getAge());
		System.out.println("p1의gender : "+ p1.getGender());
		System.out.println("p1의phone : "+ p1.getPhone());
		System.out.println("p1의pNo : "+ p1.getpNo());
		System.out.println("p1의address : "+ p1.getAddress());
				
		System.out.println("--------------------------");
		
		People p2 = new People();
		
		p2.setName("이우진");
		p2.setAge(24);
		p2.setGender('남');
		p2.setpNo("220101-0000000");
		p2.setPhone("010-8791-6290");
		p2.setAddress("서울시 중구 남대문로 120 대일빌딩 3층 E강의장");
		
		System.out.println("p2의name : "+ p2.getName());
		System.out.println("p2의age : "+ p2.getAge());
		System.out.println("p2의gender : "+ p2.getGender());
		System.out.println("p2의phone : "+ p2.getPhone());
		System.out.println("p2의pNo : "+ p2.getpNo());
		System.out.println("p2의address : "+ p2.getAddress());
		
		
		
		
		
		
	}
	

}
