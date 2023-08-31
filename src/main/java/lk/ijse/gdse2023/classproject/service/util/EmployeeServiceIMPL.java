package lk.ijse.gdse2023.classproject.service.util;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.entity.Employee;
import lk.ijse.gdse2023.classproject.entityDTOConversion.EntityDTOConversion;
import lk.ijse.gdse2023.classproject.repository.EmployeeRepository;
import lk.ijse.gdse2023.classproject.service.EmployeeService;
import lk.ijse.gdse2023.classproject.util.HibernateBTR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeServiceIMPL implements EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) throws Exception {
        employeeDTO.setEmpID(UUID.randomUUID().toString());
        Employee employeeEntity = convertToEntity(employeeDTO);
        return convertToDTO(employeeRepository.save(employeeEntity));


    }

    @Override
    public EmployeeDTO saveEmployeePlusProfile(EmployeeDTO employee) {
        //convert via Model Mapper

        return null;
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return null;
    }

    @Override
    public void deleteEmployee(String id) {

    }

    @Override
    public void updateEmployee(String id, EmployeeDTO employee) {

    }
//    List<EmployeeDTO>empLst = new ArrayList<>();
//
//    @Override
//    public EmployeeDTO saveEmployee(EmployeeDTO employee) {
//
//        if(employee != null){
//            EmployeeDTO employeeData= new EmployeeDTO(employee.getEmpID(),
//                    employee.getEmpName(), employee.getEmpEmail(), employee.getEmpDep());
//            empLst.add(employeeData);
//            System.out.println("EmpList "+empLst);
//            return employeeData;
//        }else {
//            return null;
//            //send exception
//        }
//    }
//
//    @Override
//    public EmployeeDTO saveEmployeePlusProfile(EmployeeDTO employee) {
//        if(employee !=null){
////
//            //Img data to Base64
//            String profileBase64 = Base64.getEncoder().encodeToString(employee.getEmpProfile());
//            System.out.println(profileBase64);
//            //create new entity for the database
//            Employee employeeEntity = new Employee(employee.getEmpID(),
//                    employee.getEmpName(), employee.getEmpEmail(), employee.getEmpDep(), profileBase64);
//            //convert and return
//            return employee;
//        }else {
//            return null;
//        }
//    }
//
//    @Override
//    public List<EmployeeDTO> getAllEmployees() {
//        return empLst;
//    }
//
//    @Override
//    public void deleteEmployee(String id) {
//
//    }
//
//    @Override
//    public void updateEmployee(String id, EmployeeDTO employee) {
//    }

    private Employee convertToEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmpID(employeeDTO.getEmpID());
        employee.setEmpName(employeeDTO.getEmpName());
        employee.setEmpEmail(employeeDTO.getEmpEmail());
        employee.setEmpDep(employeeDTO.getEmpDep());
        return employee;
    }

    private EmployeeDTO convertToDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpID(employee.getEmpID());
        employeeDTO.setEmpName(employee.getEmpName());
        employeeDTO.setEmpEmail(employee.getEmpEmail());
        employeeDTO.setEmpDep(employee.getEmpDep());
        return employeeDTO;
    }


}
