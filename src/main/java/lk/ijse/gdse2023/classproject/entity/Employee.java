package lk.ijse.gdse2023.classproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee implements SuperEntity{
    @Id
    private String empID;
    @Column(nullable = false)
    private String empName;
    @Column(nullable = false)
    private String empEmail;
    private String empProfile;

    @ManyToOne
    @JoinColumn(name = "departmentId",referencedColumnName = "depId",nullable = false)
    private Department department;

    public Employee(String empID,Department department) {
        this.department = department;
        this.empID = empID;
    }
}
