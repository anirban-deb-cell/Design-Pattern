package org.design.pattern.singleton;

public class Singleton {
	
	private Singleton() {}
	
	private static Singleton INSTANCE = null;
	
	public static Singleton getInstance() {
		if(INSTANCE == null) {
			synchronized (Singleton.class) {
				INSTANCE = new Singleton();
			}
		}
		return INSTANCE;
	}
	

}
