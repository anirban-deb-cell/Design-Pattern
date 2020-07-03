package org.design.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Break Singleton

public class BreakingSingleton {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton singletonInstanceOne = Singleton.getInstance();
		Singleton singletonInstanceTwo = null;
		
		Constructor constructors[] = Singleton.class.getDeclaredConstructors(); // return public, protected, default (package) access, and private constructors.
		
			for(Constructor constructor : constructors) {
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				singletonInstanceTwo = (Singleton)constructor.newInstance();
				break;
			}
			
			System.out.println("SingletonInstanceOne :"+singletonInstanceOne.hashCode());
			System.out.println("SingletonInstanceTwo :"+singletonInstanceTwo.hashCode());
		
	}

}
