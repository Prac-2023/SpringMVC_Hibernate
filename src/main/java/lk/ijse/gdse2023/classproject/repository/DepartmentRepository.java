package lk.ijse.gdse2023.classproject.repository;

import lk.ijse.gdse2023.classproject.entity.Department;
import lk.ijse.gdse2023.classproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository{
   Department saveDepartment(Department department);
   Department findById(String id);
   List<Department> getAll();
   void deleteDepartment(String id);
   void updateDepartment(String id,Department department);

}
