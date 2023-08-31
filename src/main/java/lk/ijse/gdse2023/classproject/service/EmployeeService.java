package lk.ijse.gdse2023.classproject.service;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employee) throws Exception;
    EmployeeDTO saveEmployeePlusProfile(EmployeeDTO employee);
    List<EmployeeDTO> getAllEmployees();
    void deleteEmployee(String id);
    void updateEmployee(String id,EmployeeDTO employee );
}
