package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	Add add = new Add();
    	Sub sub = new Sub();
    	Mul mul = new Mul();
    	Div div = new Div();
    	
    	while(true) {
    		System.out.print(">> ");
    		String input = scan.nextLine();
    		
    		if(input.equals("/q")) {
    			System.out.println("종료합니다");
    			break;
    		}
    		
    		String[] str =input.split(" ");
    		
    		int num1 =Integer.parseInt(str[0]);
    		int num2 = Integer.parseInt(str[2]);
    		String num3 = str[1];
    		
    		if(str[1].equals("+")) {	
    			
    			add.setValue(num1, num2);
    			System.out.println(">> " + add.calculate());
    		
    		} else if(str[1].equals("-")) {		
    			
    			sub.setValue(num1,num2);
    			System.out.println(">> " + sub.calculate());
    		
    		} else if(str[1].equals("*")) {
    			
    			mul.setValue(num1,num2);
    			System.out.println(">> " + mul.calculate());
    			
    		} else if(str[1].equals("/")) {
    			
    			div.setValue(num1, num2);
    			System.out.println(">> " + div.calculate());
    		
    		} else {
    			System.out.print("알 수 없는 연산입니다.");
    		}
    		
    	}
    	
    	scan.close();
    	
    }
}
