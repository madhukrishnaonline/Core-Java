package mk;

import test.*;

public class DemoInterface5 {
	public static void main(String[] args) {
		IClass ic = new IClass();
		int x = ic.mk(55);
		ic.dis();
		System.out.println("The Value x : " + x);
		Interface.m1(65);
		Interface.interfaces(66);
	}// main
}// class