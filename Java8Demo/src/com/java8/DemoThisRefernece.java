package com.java8;

public class DemoThisRefernece {
	public static void main(String[] args) {
		DemoThisRefernece obj = new DemoThisRefernece();
		/*// using Anonymous classes
		 * obj.doProcess(100, new Process() {
		 * 
		 * @Override public void process(int i) { // TODO Auto-generated method stub
		 * System.out.println(this); }
		 * 
		 * });
		 */
		obj.doProcess(100, a->System.out.println("this wont work here"));
		obj.execute();
	}
	public void execute() {
		doProcess(10,a->System.out.println(this));
	}
	public void doProcess(int a,Process p) {
		p.process(a);
	}
}
