package com.qa.oopexercisebook;
// Superclass with getters and setters
public class Animal {

	private boolean flyy = true;
	private boolean run = true;
	private int height = 21;
	
	public boolean isFlyy() {
		return flyy;
	}
	public void setFlyy(boolean flyy) {
		this.flyy = flyy;
	}
	public boolean isRun() {
		return run;
	}
	public void setRun(boolean run) {
		this.run = run;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
