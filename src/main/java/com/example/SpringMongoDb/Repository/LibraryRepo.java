package com.example.SpringMongoDb.Repository;

import com.example.SpringMongoDb.Service.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibraryRepo extends MongoRepository<Library,String> {
}
