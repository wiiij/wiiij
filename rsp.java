package 연습;

import java.util.Scanner;

public class rsp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("가위(0), 바위(1) 보(2) 입력 :");
		System.out.println("=>");
		int a = sc.nextInt();
	    
		if (a==0) {
			System.out.println("나 : 가위");
			}
		if (a==1) {
			System.out.println("나 : 바위");
			}
		if (a==2) {
			System.out.println("나 : 보");
			}
		
		//컴퓨터
		int com=(int)(Math.random()*3);
		if(com==0)
		{
			System.out.println("컴 : 가위");
		}
		if(com==1)
		{
			System.out.println("컴 : 바위");
		}
		if(com==2)
		{
			System.out.println("컴 : 보");
		}
		//컴퓨터가 가위
		if(com==0) 
		{
			if(a==0)
			{
				System.out.println("비겼습니다");
			}
			if(a==1) 
			{	
				System.out.println("당신이 이겼습니다");
			}
			if(a==2) 
			{	
				System.out.println("컴퓨터가 이겼습니다");
			}
		}
		
		//컴퓨터가 바위
		if(com==1) {
			if(a==0)
			{
				System.out.println("컴퓨터가 이겼습니다");
			}
			if(a==1) 
			{	
				System.out.println("비겼습니다");
			}
			if(a==2) 
			{	
				System.out.println("당신이 이겼습니다");
			}			
		}
		//컴퓨터가 보자기
		if(com==2) {
			if(a==0)
			{
				System.out.println("당신이 이겼습니다");
			}
			if(a==1) 
			{	
				System.out.println("컴퓨터가 이겼습니다");
			}
			if(a==2) 
			{	
				System.out.println("비겼습니다");
			}
		}
	}
	

	}