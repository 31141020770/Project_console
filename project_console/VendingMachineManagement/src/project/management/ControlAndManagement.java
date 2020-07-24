package project.management;

import java.util.Scanner;

import project.management.service.ILoginService;
import project.management.service.impl.LoginService;

public class ControlAndManagement {
	public ControlAndManagement() {
		ILoginService loginService = new LoginService();
		System.out.println("choose: 1.customer  2.staff");
		System.out.println("input: 1 or 2");
		
		Scanner scan = new Scanner(System.in);
		String key = scan.next();
		switch (key) {
		case "1":{
			System.out.println("1");
			
			break;
		}
		case "2":{
			System.out.println("input username");
			String username = scan.next();
			System.out.println("input password");
			String password = scan.next();
			String role = loginService.login(username, password);
			System.out.println(role);
			break;
		}
		default:
			System.out.println("you choose false please choose again");
			new ControlAndManagement();
		}
	}
}
