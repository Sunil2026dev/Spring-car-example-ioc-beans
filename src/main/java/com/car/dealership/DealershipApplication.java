package com.car.dealership;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class DealershipApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

		Car normalCar = (Car) context.getBean("normalCar");
		Car sportsCar = (Car) context.getBean("sportsCar");
		Car truck = (Car) context.getBean("truck");
		Scanner sc= new Scanner(System.in);
		System.out.println("Hi, please enter your name:");
		String name = sc.nextLine();
		System.out.println("Please select your car of choice");
		System.out.println("1) For Family car");
		System.out.println("2) For Sports car");
		System.out.println("3) For Truck");
		int Choice = sc.nextInt();

		normalCar.setOwnerName(name);
		sportsCar.setOwnerName(name);
		truck.setOwnerName(name);


		switch (Choice){
			case 1:
				normalCar.getInfo();
				break;
			case 2:
				sportsCar.getInfo();
				break;
			case 3:
				truck.getInfo();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}

	}

}
