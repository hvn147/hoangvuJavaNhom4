
package vu;

import java.util.Scanner;

public class stringbai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
	    int doDai;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhap vao chuoi bat ky tu ban phim: ");
	    chuoi = scanner.nextLine();
	    doDai = chuoi.length();
	    System.out.println("Chuỗi " + chuoi + " có độ dài = " + doDai);
	}
	}

