package miniprojects;

import java.util.Scanner;

public class Cinema {
	
	static int row=0, seats=0;
	static int rown=0, seatsn=0;
	static int input=0;
	static String[][]arraySeat =new String[10][10];
	
	static int tickets=0;
	static double percentage=0.00f;
	static int totalincome=0;
	static int currentincome=0;
	static boolean emptyseat;

	static Scanner scanner= new Scanner(System.in);
	
	public static int pricing(int r, int s, int n) {
		int row2= Math.round(r/2);
	    int income=0;
		
		if(r*s<=60) {
			 income=10;
		 } 
		 
		 else{
			 if(n>row2) {
				 income=8;
			 }
			 else if(n<=row2) {
				 income=10;
			 }	
		 }
		System.out.println("Ticket price: $"+ income);
		currentincome=currentincome+income;
	    tickets++;
		return tickets;	
	}
	
	public static int totalIncome(int r, int s) {
	    int frontSeat=0, endSeat=0;
		int row2= Math.round(r/2);
		
		if(r*s<=60) {
			 totalincome=r*s*10;
		 }
		 
		 else{
			 frontSeat=s*10*row2;
			 endSeat=8*(r-row2)*s;
			 totalincome=frontSeat+endSeat;
		 }		
		return totalincome;
	}
	
	public static void statistics(int r,int s) {
		
		percentage=(double)tickets*100/(r*s);
		
		System.out.println("Number of purchased tickets: "+tickets);
		System.out.println("Percentage: "+String.format("%.2f",percentage)+"%");
		System.out.println("Current income: $"+currentincome);
		System.out.println("Total income: $"+totalIncome(r,s));
		
	}
	
	public static void newDisplay(String [][]array,int a, int b) {
		System.out.println("Cinema:");
		System.out.print(" ");
		for(int i=1;i<=b;i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		
		for (int i=1; i<=a;i++) {
			System.out.print(i);
			for(int j=0;j<b;j++) {	
				System.out.print(" "+arraySeat[i][j]);
			}
			
			System.out.println();
		}	
	}
	
	
	public static void emptySeat(String[][] array,int r,int s) {
		
	
		
	}
	
	public static void menu() throws RuntimeException {
		System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
		input= scanner.nextInt();
		
		if(input==1) {
				newDisplay(arraySeat,rown,seatsn);
		}
		else if(input==2) {
			
			do{
			
			System.out.println("Enter a row number:");
			row= scanner.nextInt();
			System.out.println("Enter a seat number in that row:");
			seats= scanner.nextInt();
			
			try {
			 if(arraySeat[row][(seats-1)].equals("B")) {
				System.out.println("That ticket has already been purchased!");
				emptyseat=false;
			 }
			 else {
					emptyseat=true;
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Wrong input!");
				emptyseat=false;
			}
			
			}while (emptyseat==false);
			
			arraySeat[row][(seats-1)]="B";
			pricing(rown,seatsn,row);
		}
		else if(input==3) {
			statistics(rown,seatsn);
		}
	}
	public static void main(String[] args) {

		System.out.println("Enter the number of rows:");
		rown= scanner.nextInt();
		System.out.println("Enter the number of seats in each row:");
		seatsn= scanner.nextInt();
		
		for(int i=0; i<10;i++) {
			for(int j=0; j<10;j++) {
				arraySeat[i][j]="S";
			}
		}
		
		do {
			menu();
		}while(input !=0);
		
		 
	}

}
