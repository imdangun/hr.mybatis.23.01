package com.my.hr.presentation;

public enum Job {
	EXIT("종료"), LIST("목록"), ADD("추가"), FIX("수정"), DEL("삭제");
	
	private String label;
	
	private Job(String label) {
		this.label = label;
	}	
	
	public static int length() {
		return values().length;
	}
	
	public static Job valueOf(int ordinal) {		
		return values()[ordinal];
	}	
	
	public static String labels() {
		Job[] jobs = values();
		String labels = "";
		String last = "";
		
		for(Job HR: jobs) {
			if(HR.ordinal() == 0) last = HR.ordinal() + "." + HR.label;
			else labels += HR.ordinal() + "." + HR.label + ", ";
		}		
		labels += last;
		
		return labels;
	}	
}
