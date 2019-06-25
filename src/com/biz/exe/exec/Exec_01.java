package com.biz.exe.exec;

import com.biz.exe.service.JavaService;
import com.biz.exe.service.JavaServiceImp_02;

public class Exec_01 {
	public static void main(String[] args) {
		
		JavaService js = new JavaServiceImp_02();
		js.call();
		js.call(100);
		js.call(100,200);
		/*
		 * 클래스의 메서드를 호출한다는개념
		 * 클래스를 생성할때 정의한 메서드에게 어떤일인가를 시키는 것
		 * 우리는 그 메서드가 
		 */
	}
	
}
