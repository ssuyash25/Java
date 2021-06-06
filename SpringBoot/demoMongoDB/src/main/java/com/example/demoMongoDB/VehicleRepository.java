package com.example.demoMongoDB;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

/*
This repository is an interface and lets you perform various operations that involve Vehicle objects.
It gets these operations by extending MongoRepository,
which in turn extends the PagingAndSortingRepository interface defined in Spring Data Commons.
At runtime, Spring Data REST automatically creates an implementation of this interface.
Then it uses the @RepositoryRestResource annotation to direct Spring MVC to create RESTful endpoints
at /vehicle.
 */
@RepositoryRestResource(collectionResourceRel = "vehicle", path = "vehicle")
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    List<Vehicle> findByVehicleNo(@Param("number") String number);
}
