package com.employee.management.controller;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.management.model.Department;
import com.employee.management.service.DepartmentService;
@RestController
public class DepartmentController {	
	static final Logger logger  = LogManager.getLogger(DepartmentController.class.getName());
	@Autowired
	private DepartmentService departmentService;
		@GetMapping("/departments")
		public List<Department> getAllDepartment(){
			return departmentService.getAllDepartments();
		}
		@GetMapping("/departments/{id}")
		public Department getDepartment(@PathVariable int id){
			return departmentService.getDepartment(id);
		}
		@PostMapping("/departments")
		public void addDepartment(@RequestBody Department department){
			departmentService.addDepartment(department);
		}
		@PutMapping("/departments/{id}")
		public void updateDepartment(@RequestBody Department d, @PathVariable int id){
			departmentService.updateDepartment(d, id);
		}
		@DeleteMapping("/departments")
		public void deleteAllDepartments(){
			departmentService.deleteAllDepartment();
		}
		@DeleteMapping("departments/{id}")
		public void deleteDepartmentByID(@RequestBody Department d, @PathVariable int id){
			departmentService.deleteDepartmentByID(id);
		}
		@PatchMapping("departments/{id}")
		public void patchDepartmentByID(@RequestBody Department d, @PathVariable int id) {
			departmentService.patchDepartment(d, id);
		}
}
