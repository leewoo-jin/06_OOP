package edu.kh.oop.practice.model.vo;

public class Hero {

	 private String job;
	 private int hp;
	 private int mp;
	 private char gender;
	 private int level;
	 
	 public Hero() {}
	 
	 public void attack() {
		System.out.println(" 가 기본 공격을 했다 (-150)");
	 }
	 public void jump() {
		 System.out.println(" 의 점프!");
	 }

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	 
	 
		
	}
	

	 
	

