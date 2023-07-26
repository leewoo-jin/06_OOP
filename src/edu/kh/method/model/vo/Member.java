package edu.kh.method.model.vo;

public class Member {
	
	//필드

	private String MemberId; //아이디
	private String MemberPw; //비밀번호
	private String MemberName; //이름
	private int MemberAge; //나이
	
	
	
	// 기본 생성자
	// 생상자 규칙 : 반환형이 없고,클래스와 이름이 같아야한다.
	public Member() {}
	
	// 매개변수 생성자 (필드 모두 초기화)
	public Member(String MemberId,String MemberPw,String MemberName,
			int MemberAge) {
		//오버로딩 적용(매개변수의 개수가 다름)
		
		//매개변수로 전달받은 값을 필드로 대입시키기.
		this.MemberId = MemberId;
		this.MemberPw = MemberPw;
		this.MemberName = MemberName;
		this.MemberAge = MemberAge;
		
	}
	//메서드(getter/setter 포함)
	//alt + shift + s => r

	public String getMemberId() {
		return MemberId;
	}

	public void setMemberId(String memberId) {
		MemberId = memberId;
	}

	public String getMemberPw() {
		return MemberPw;
	}

	public void setMemberPw(String memberPw) {
		MemberPw = memberPw;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	public int getMemberAge() {
		return MemberAge;
	}

	public void setMemberAge(int memberAge) {
		MemberAge = memberAge;
	}

	
		
	
	
	
  }
	

