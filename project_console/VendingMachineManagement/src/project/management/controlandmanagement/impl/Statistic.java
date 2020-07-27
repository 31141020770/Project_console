package project.management.controlandmanagement.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project.management.controlandmanagement.IProduct;
import project.management.controlandmanagement.IStatistics;
import project.management.entity.ProductEntity;
import project.management.entity.StoreMachineEntity;
import project.management.service.IStatisticsService;
import project.management.service.impl.StatisticsService;

public class Statistic implements IStatistics {
	IStatisticsService statisticsService = new StatisticsService();
	Scanner scan = new Scanner(System.in);
	IProduct product = new Product();
	@Override
	public void statistics() {
		System.out.println("welcome to Find option !!!");
		System.out.println(
				"select option: 4.1 product of a machine , 4.2 finance , 4.3 inventory , 4.4 machine 4.5 out to select option of ADMIN");
		System.out.println(" please input 1 or 2 or 3 or 4 or 5");
		String key = scan.next();
		switch (key) {
		case "1": {
			System.out.println("list product of machine ");
			System.out.println("please input id of machine");
			int id = scan.nextInt();
			findAllProductOfAMachine(id);
			statistics();
			break;
		}
		case "2": {
 
			break;
		}
		case "3": {

			break;
		}
		case "4": {
			System.out.println("list of machine ");
			findAllMachine();
			statistics();
			break;
		}
		case "5": {
			product.product();
			break;
		}
		default:
			break;
		}
	}

	@Override
	public void findAllProductOfAMachine(int id) {
		List<ProductEntity> productEntities = new ArrayList<ProductEntity>();
		productEntities = statisticsService.findByMachine(id);
		for (int i = 0; i < productEntities.size(); i++) {
			System.out.println("------------------------------------");
			System.out.println("product ID: " + productEntities.get(i).getId());
			System.out.print(" product name: " + productEntities.get(i).getName());
			System.out.print(" product price: " + productEntities.get(i).getPrice());
			System.out.println(" product total: " + productEntities.get(i).getTotal());
		}
		System.out.println("------------------------------------");
	}

	@Override
	public void findAllMachine() {
		List<StoreMachineEntity> storeMachineEntities = new ArrayList<>();
		storeMachineEntities = statisticsService.findAllMachine();
		;
		for (int i = 0; i < storeMachineEntities.size(); i++) {
			System.out.println("------------------------------------");
			System.out.println("product ID: " + storeMachineEntities.get(i).getId());
			System.out.print(" product name: " + storeMachineEntities.get(i).getName());
			System.out.print("  || product address: " + storeMachineEntities.get(i).getAddress());
			System.out.println("  || product userid: " + storeMachineEntities.get(i).getUserid());
		}
		System.out.println("------------------------------------");
	}

}
