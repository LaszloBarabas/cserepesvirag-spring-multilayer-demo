package com.example.cserepesuzlet.persistency.repo;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CserepesViragRepo extends CrudRepository<CserepesVirag, String> {

}
