package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {

	public static void main(String[] args) {
		
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		
		System.out.println("========== TESTE DO DEPARTMENT ==========");
		System.out.println("-------------- Teste 1 -> insert department --------------");
		Department dep = new Department(null, "Music");
		dao.insert(dep);
		System.out.println("insert runned! id = " +dep.getId());

	}

}
