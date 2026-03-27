package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {

	public static void main(String[] args) {
		
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("========== TESTE DO DEPARTMENT ==========");
		System.out.println("-------------- Teste 1 -> insert department --------------");
		Department dep = new Department(null, "Music");
		dao.insert(dep);
		System.out.println("insert runned! id = " +dep.getId());
		*/
		
		System.out.println("-------------- Teste 2 -> get department by id--------------");
		Department dep = dao.findById(4);
		System.out.println(dep);
		
		System.out.println("\n-------------- Teste 3 -> update department--------------");
		Department depUp = dao.findById(6);
		depUp.setName("Backend");
		dao.update(depUp);
		System.out.println("Updated complete!");
		
		System.out.println("\n-------------- Teste 4 -> findAll department--------------");
		List<Department> list = dao.findAll();
		list.forEach(d -> {
			System.out.println(d);
		});
		
		System.out.println("\n-------------- Teste 5 -> delete department by id--------------");
		dao.deleteById(7);
		System.out.println("Delete executed!");
	}

}
