package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test1: department insert ===");
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		System.out.println("=== Test2: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== Test3: department update ===");
		department = departmentDao.findById(1);
		department.setName("Updated Name");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("=== Test4: department delete ===");
		System.out.println("Enter a Id to delete");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");
		
		System.out.println("=== Test5: department findAll===");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
				
		sc.close();
	}
}
