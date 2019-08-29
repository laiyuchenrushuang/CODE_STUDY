package com.study;
import java.text.DecimalFormat;
public class DecimalFormatTest {
	public static void main(String[] args) {
		double znj = 100.02;
		String temp = new DecimalFormat("#").format(Double.parseDouble(znj+""));
		System.out.println(temp);
	}
}
