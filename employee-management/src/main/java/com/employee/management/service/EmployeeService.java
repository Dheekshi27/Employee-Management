package com.employee.management.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
		public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	public Employee getEmployee(int id){
		return employeeRepository.findOne(id);
	}
		public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
		public void deleteAllEmployees(){
		employeeRepository.deleteAll();
	}
		public void deleteEmployeeByID(int id){
		employeeRepository.delete(id);
	}
		public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
}
