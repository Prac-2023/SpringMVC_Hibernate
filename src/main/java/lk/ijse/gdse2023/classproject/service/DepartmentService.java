package lk.ijse.gdse2023.classproject.service;

import lk.ijse.gdse2023.classproject.dto.DepartmentDTO;
import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;

import java.util.List;

public interface DepartmentService {
    DepartmentDTO saveDepartment(DepartmentDTO department) throws Exception;
    List<DepartmentDTO> getAllDepartments();
    void deleteDepartment(String id);
    void updateDepartment(String id,DepartmentDTO department );
}
