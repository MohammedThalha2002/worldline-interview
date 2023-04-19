package com.worldline.employee.employeereg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "name should not be blank")
    private String name;
    @NotBlank(message = "email should not be blank")
    private String email;
    @NotBlank(message = "dob should not be blank")
    private String dob;
    @NotBlank(message = "phone should not be blank")
    private String phone;
    @NotBlank(message = "gender should not be blank")
    private String gender;
    @NotBlank(message = "job should not be blank")
    private String job;
    @NotBlank(message = "qualification should not be blank")
    private String qualification;
    @NotBlank(message = "exp should not be blank")
    private String exp;
    @NotBlank(message = "date of joining should not be blank")
    private String doj;

    public Employee() {
    }

    public Employee(Integer id, String name, String email, String dob, String phone, String gender, String job,
            String qualification, String exp, String doj) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.gender = gender;
        this.job = job;
        this.qualification = qualification;
        this.exp = exp;
        this.doj = doj;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExp() {
        return this.exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getDoj() {
        return this.doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}
