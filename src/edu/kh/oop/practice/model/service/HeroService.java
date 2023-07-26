package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	 public void practice() {
		 
		 Hero worrior = new Hero();
		 Hero wijard = new Hero();
		 Hero healer = new Hero();
		 
		 worrior.setJob("워리어");
		 worrior.setHp(18000);
		 worrior.setMp(5000);
		 worrior.setGender('남');
		 worrior.setLevel(5);
		 
		 wijard.setJob("위자드");
		 wijard.setHp(5000);
		 wijard.setMp(25000);
		 wijard.setGender('여');
		 wijard.setLevel(2);
		 
		 healer.setJob("힐러");
		 healer.setHp(10000);
		 healer.setMp(50000);
		 healer.setGender('남');
		 healer.setLevel(10);
		 
	 }
	 
	 
	}


		
		
	




