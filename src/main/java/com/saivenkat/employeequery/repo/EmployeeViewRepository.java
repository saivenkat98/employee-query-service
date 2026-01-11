package com.saivenkat.employeequery.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.saivenkat.employeequery.model.EmployeeView;

public interface EmployeeViewRepository extends MongoRepository<EmployeeView, String>{}

// Spring Data provides:
// MongoRepository<T, ID>

// When you extend it, Spring automatically gives you:

// Method	What it does
// save(entity)	Insert or update document
// findById(id)	Fetch by _id
// findAll()	Fetch all documents
// deleteById(id)	Delete document
// existsById(id)	Check existence
// count()	Count documents

// Without you writing any implementation.

// So now you can write:

// employeeViewRepository.save(view);


// And Spring handles:

// Object → BSON conversion
// Mongo driver calls
// Connection handling
// Error handling
// Mapping back to Java