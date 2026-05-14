package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
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
	}
}
