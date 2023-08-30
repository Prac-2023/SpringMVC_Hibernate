package lk.ijse.gdse2023.classproject.service.util;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.entity.Employee;
import lk.ijse.gdse2023.classproject.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class EmployeeServiceIMPL implements EmployeeService {
    List<EmployeeDTO>empLst = new ArrayList<>();

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employee) {
        
        if(employee != null){
            EmployeeDTO employeeData= new EmployeeDTO(employee.getEmpID(),
                    employee.getEmpName(), employee.getEmpEmail(), employee.getEmpDep());
            empLst.add(employeeData);
            System.out.println("EmpList "+empLst);
            return employeeData;
        }else {
            return null;
            //send exception
        }
    }

    @Override
    public EmployeeDTO saveEmployeePlusProfile(EmployeeDTO employee) {
        if(employee !=null){
//
            //Img data to Base64
            String profileBase64 = Base64.getEncoder().encodeToString(employee.getEmpProfile());
            System.out.println(profileBase64);
            //create new entity for the database
            Employee employeeEntity = new Employee(employee.getEmpID(),
                    employee.getEmpName(), employee.getEmpEmail(), employee.getEmpDep(), profileBase64);
            //convert and return
            return employee;
        }else {
            return null;
        }
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return empLst;
    }

    @Override
    public void deleteEmployee(String id) {

    }

    @Override
    public void updateEmployee(String id, EmployeeDTO employee) {
    }
}
