package lk.ijse.gdse2023.classproject.api;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Autowired
    private EmployeeService employeeService;

   @ResponseStatus(HttpStatus.CREATED)
   @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
   EmployeeDTO saveEmployeeWithProfile(
           @RequestPart String name,
           @RequestPart String email,
           @RequestPart String department,
           @RequestPart byte [] profile
   ) throws Exception {
       //convert byte to base64string
       String profileToBase64 = Base64.getEncoder().encodeToString(profile);

       EmployeeDTO employeeObj = new EmployeeDTO();
       employeeObj.setEmpName(name);
       employeeObj.setEmpEmail(email);
       employeeObj.setEmpDep(department);
       employeeObj.setEmpProfile(profileToBase64);

       return employeeService.saveEmployee(employeeObj);
   }
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @DeleteMapping("{id}")
   void deleteEmployee(@PathVariable String id){
       employeeService.deleteEmployee(id);
   }
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @PatchMapping("{id}")
   void updateEmployee(@PathVariable String empId,
                       @RequestPart String updatedName,
                       @RequestPart String updatedEmail,
                       @RequestPart String updatedDepartment,
                       @RequestPart byte [] updatedProfile


   ){
       String updatedProfileBase64 = Base64.getEncoder().encodeToString(updatedProfile);

       EmployeeDTO tobeUpdatedEmp = new EmployeeDTO();
       tobeUpdatedEmp.setEmpName(updatedName);
       tobeUpdatedEmp.setEmpEmail(updatedEmail);
       tobeUpdatedEmp.setEmpDep(updatedDepartment);
       tobeUpdatedEmp.setEmpProfile(updatedProfileBase64);

       employeeService.updateEmployee(empId,tobeUpdatedEmp);

   }
   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
   List<EmployeeDTO>getAllEmployee(){
      return employeeService.getAllEmployees();
   }


}
