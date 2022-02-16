package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	Journey x=(Journey)ac.getBean("vzg");
	x.startJourney();
	Journey x1=(Journey)ac.getBean("goa");
	x1.startJourney();
	
	
}
}
