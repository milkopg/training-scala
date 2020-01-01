package com.milko.trainings.scala.switches.javac;

public class Switch {

	public static void main(String[] args) {
		String month = "August";
		String quarter ;
		
		switch (month) {
		case "January":
		case "February":
		case "March":
			quarter = "1st quarter";
			break;
		case "April":
		case "May":
		case "June":
			quarter = "2nd quarter";
			break;
		case "July":
		case "August":
		case "September":
			quarter = "3rd quarter";
			break;
			
		case "October":
		case "November":
		case "December":
			quarter = "4rd quarter";
			break;
			
		default:
			quarter = "Unknown quarter";
			break;
		}
		System.out.println(quarter);
	}

}
