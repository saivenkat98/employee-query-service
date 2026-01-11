package com.saivenkat.employeequery.model;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employees")
public class EmployeeView {

    @Id
    private String id;//employeeId

    private String name;
    private String email;
    private String department;

    private Instant createdAt;

    public EmployeeView() {}

    public EmployeeView(String id, String name, String email, String department, Instant createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.createdAt = createdAt;
    }

    public String getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getDepartment() {return department;}
    public Instant getCreatedAt() {return createdAt;}


    public void setId(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setDepartment(String department) {this.department = department;}
    public void setCreatedAt(Instant createdAt) {this.createdAt = createdAt;}

}
