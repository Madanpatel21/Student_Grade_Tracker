package Grade_system;

import java.util.ArrayList;

public class Student {
	private String Student_name;
	private ArrayList<Integer> Grade;
	public String getStudent_name() {
		return Student_name;
	}
	public ArrayList<Integer> getGrade() {
		return Grade;
	}
	 public Student(String name) {
	        this.Student_name= name;
	        this.Grade= new ArrayList<>();
	    }
	 
	public void addGrade(int grade) {
		Grade.add(grade);
	}
	public int getHighest() {
		if(Grade.isEmpty())
			return 0;
		int max =Grade.get(0);
		for(int g: Grade) {
			if(g>max)
				max=g;
		}
		return max;
	}
	public int getLowest() {
		if(Grade.isEmpty())
			return 0;
		int min =Grade.get(0);
		for(int g: Grade) {
			if(g<min)
				min=g;
		}
		return min;
	}
	public double getAverage() {
		if(Grade.isEmpty())
			return 0;
		double sum=0;
		for(int g: Grade) {
			sum+=g;
		}
		return  sum;
	}
	
}