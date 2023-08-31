package lk.ijse.gdse2023.classproject.repository;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface EmployeeRepository {
   Employee saveEmployee(Employee employee);
   List<Employee> getAll();
   void deleteEmployee(String id);
   void updateEmployee(String id,Employee employee);

}
