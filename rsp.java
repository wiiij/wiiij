package ����;

import java.util.Scanner;

public class rsp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����(0), ����(1) ��(2) �Է� :");
		System.out.println("=>");
		int a = sc.nextInt();
	    
		if (a==0) {
			System.out.println("�� : ����");
			}
		if (a==1) {
			System.out.println("�� : ����");
			}
		if (a==2) {
			System.out.println("�� : ��");
			}
		
		//��ǻ��
		int com=(int)(Math.random()*3);
		if(com==0)
		{
			System.out.println("�� : ����");
		}
		if(com==1)
		{
			System.out.println("�� : ����");
		}
		if(com==2)
		{
			System.out.println("�� : ��");
		}
		//��ǻ�Ͱ� ����
		if(com==0) 
		{
			if(a==0)
			{
				System.out.println("�����ϴ�");
			}
			if(a==1) 
			{	
				System.out.println("����� �̰���ϴ�");
			}
			if(a==2) 
			{	
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
		}
		
		//��ǻ�Ͱ� ����
		if(com==1) {
			if(a==0)
			{
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
			if(a==1) 
			{	
				System.out.println("�����ϴ�");
			}
			if(a==2) 
			{	
				System.out.println("����� �̰���ϴ�");
			}			
		}
		//��ǻ�Ͱ� ���ڱ�
		if(com==2) {
			if(a==0)
			{
				System.out.println("����� �̰���ϴ�");
			}
			if(a==1) 
			{	
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
			if(a==2) 
			{	
				System.out.println("�����ϴ�");
			}
		}
	}
	

	}