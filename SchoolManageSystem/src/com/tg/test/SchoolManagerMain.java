package com.tg.test;

import com.tg.service.ScoreManager;
import com.tg.student.StudentVo;
import com.tg.subject.EnglishL;
import com.tg.subject.KoreaL;
import com.tg.subject.MathL;

public class SchoolManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnglishL englishL = new EnglishL("영어", 80);
		KoreaL koreaL = new KoreaL("국어", 90);
		MathL math = new MathL("수학",100);
		
		StudentVo studentVo = new StudentVo(1, "원아름", koreaL, englishL, math);
		ScoreManager scoreManeger = new ScoreManager();
		scoreManeger.setScoreTotal(studentVo);		
		scoreManeger.studentInfo(studentVo);
		
		EnglishL englishL2 = new EnglishL("영어", 50);
		KoreaL koreaL2 = new KoreaL("국어", 40);
		MathL math2 = new MathL("수학",100);
		
		StudentVo studentVo2 = new StudentVo(2, "차정경", koreaL2, englishL2, math2);
		scoreManeger.setScoreTotal(studentVo2);		
		scoreManeger.studentInfo(studentVo2);

		
		
		
		
		
		
		
	

	}

}
