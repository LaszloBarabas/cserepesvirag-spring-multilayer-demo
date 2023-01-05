package com.example.cserepesuzlet.domain.putservices;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import com.example.cserepesuzlet.persistency.repo.CserepesViragRepoInst;
import com.example.cserepesuzlet.persistency.repo.MemCserepesVirag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class PutCserepesViragService {
    private final CserepesViragRepoInst csviragRepository;
    public PutCserepesViragService(MemCserepesVirag csviragRepository) {
        this.csviragRepository = csviragRepository;
    }

    public CompletableFuture<ResponseEntity<CserepesVirag>> upsert(String id, CserepesVirag cserepesVirag) {
        return (csviragRepository.existsById(id))
                ? CompletableFuture.completedFuture(new ResponseEntity<>(csviragRepository.save(cserepesVirag), HttpStatus.OK))
                : CompletableFuture.completedFuture(new ResponseEntity<>(csviragRepository.save(cserepesVirag), HttpStatus.CREATED));
    }
}
