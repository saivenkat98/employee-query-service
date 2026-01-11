package com.saivenkat.employeequery.api;

import com.saivenkat.employeequery.model.EmployeeView;
import com.saivenkat.employeequery.repo.EmployeeViewRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeQueryController {

    private final EmployeeViewRepository repo;

    public EmployeeQueryController(EmployeeViewRepository repo){
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeView> getById(@PathVariable String id){
        return repo.findById(id)
                   .map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<EmployeeView> getAll(){
        return repo.findAll();
    }
}