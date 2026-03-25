package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department dp = new Department(1, "Jogos");
	
		Seller seller = new Seller(21, "Joao", "joao@emial", new Date(), 8900.65, dp);
		System.out.println(seller);
	}

}
