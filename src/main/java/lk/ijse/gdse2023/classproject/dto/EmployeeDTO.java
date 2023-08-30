package lk.ijse.gdse2023.classproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String empID;
    private String empName;
    private String empEmail;
    private String empDep;
    private byte[]empProfile;

    public EmployeeDTO(String empID, String empName, String empEmail, String empDep) {
        this.empID = empID;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empDep = empDep;
    }

    public EmployeeDTO(String empName, String empEmail, String empDep, byte[] empProfile) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empDep = empDep;
        this.empProfile = empProfile;
    }

    public EmployeeDTO(String empName, String empEmail, String empDep) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empDep = empDep;
    }
}
