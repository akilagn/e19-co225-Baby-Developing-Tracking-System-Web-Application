package com.babydevelopingtrackingsystem.Model;

import com.babydevelopingtrackingsystem.Utill.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Doctor extends User {
    private String specialization;
    private String hospital;
    private String regNo;

    public Doctor(String firstname, String lastname, String email, String password, Role role, String specialization, String hospital, String regNo) {
        super(firstname, lastname, email, password, role);
        this.specialization = specialization;
        this.hospital = hospital;
        this.regNo = regNo;
    }
}
