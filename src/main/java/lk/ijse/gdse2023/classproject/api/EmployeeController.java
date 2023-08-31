package lk.ijse.gdse2023.classproject.api;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
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
    @PostMapping(consumes = "application/json", produces = "application/json")
   EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employee) throws Exception {
       //ToDo:validate the request
        return employeeService.saveEmployee(employee);

   }
  // @ResponseStatus(HttpStatus.CREATED)
//   @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//   EmployeeDTO saveEmployeeWithProfile(
//           @RequestPart String name,
//           @RequestPart String email,
//           @RequestPart String department,
//           @RequestPart byte [] profile
//   )
//
//   {
//       System.out.println(name);
//       System.out.println(email);
//       System.out.println(department);
//       System.out.println(Arrays.toString(profile));
//
//     return employeeService.saveEmployeePlusProfile(new EmployeeDTO(name,email,department,profile));
//
//   }
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @DeleteMapping("{id}")
   void deleteEmployee(@PathVariable String id){
       employeeService.deleteEmployee(id);
   }
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @PatchMapping("{id}")
   void updateEmployee(@PathVariable String id,@RequestBody EmployeeDTO employee){
       System.out.println(id);
       System.out.println(employee);
   }
   @GetMapping
   List<EmployeeDTO>getAllEmployee(){
      return employeeService.getAllEmployees();
   }

}
