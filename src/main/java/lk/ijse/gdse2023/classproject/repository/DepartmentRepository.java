package lk.ijse.gdse2023.classproject.repository;

import lk.ijse.gdse2023.classproject.entity.Department;
import lk.ijse.gdse2023.classproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String>{
   Department saveDepartment(Department department);
   List<Department> getAll();
   void deleteDepartmentByDepId(String id);
   void updateByDepId(String id,Department department);

}
