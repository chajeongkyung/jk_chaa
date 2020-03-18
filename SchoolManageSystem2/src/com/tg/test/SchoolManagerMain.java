package com.tg.test;

import java.util.ArrayList;

import com.tg.service.ScoreManager;
import com.tg.student.StudentVo;
import com.tg.subject.Subject;

public class SchoolManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject subjectObj = new Subject("국어", 50);
		Subject subjectObj2 = new Subject("영어", 80);

		ArrayList subjectList = new ArrayList();
		
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		
		System.out.println(subjectList);
		
		StudentVo studentVo = new StudentVo(1, "정의광");
		
		System.out.println(studentVo);
		
		ScoreManager scoreManager = new ScoreManager();
		
		scoreManager.studentInfo(studentVo, subjectList);
		//new를 이용하여 하나의 변수로 활용
		studentVo = new StudentVo(2, "박성욱");
		subjectObj = new Subject("국어", 60);
		subjectObj2 = new Subject("영어", 70);
		subjectList = new ArrayList();
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		scoreManager.studentInfo(studentVo, subjectList);
		
		studentVo = new StudentVo(3, "차정경");
		subjectObj = new Subject("국어", 100);
		subjectObj2 = new Subject("영어", 70);
		subjectList = new ArrayList();
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		scoreManager.studentInfo(studentVo, subjectList);
		
		studentVo = new StudentVo(4, "김용훈");
		subjectObj = new Subject("국어", 70);
		subjectObj2 = new Subject("영어", 50);
		subjectList = new ArrayList();
		subjectList.add(subjectObj);
		subjectList.add(subjectObj2);
		scoreManager.studentInfo(studentVo, subjectList);

	

	}

}
