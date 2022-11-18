
package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class ServiceController {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@PostMapping("saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {

		employeeRepository.save(emp);
		return new ResponseEntity<String>("Saved successfully", HttpStatus.CREATED);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {

		employeeRepository.deleteById(id);
		return new ResponseEntity<String>("Employee Deleted successfully", HttpStatus.OK);

	}
	@PostMapping("/departments")
	public ResponseEntity<String> addDepartment(@RequestBody Department department) {

		departmentRepository.save(department);
		return new ResponseEntity<String>("Department added successfully", HttpStatus.OK);

	}
}
