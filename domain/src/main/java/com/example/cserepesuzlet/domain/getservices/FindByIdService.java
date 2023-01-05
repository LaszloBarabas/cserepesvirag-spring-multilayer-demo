package com.example.cserepesuzlet.domain.getservices;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import com.example.cserepesuzlet.persistency.repo.CserepesViragRepoInst;
import com.example.cserepesuzlet.persistency.repo.MemCserepesVirag;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class FindByIdService {
    private final CserepesViragRepoInst csviragRepository;
    public FindByIdService(MemCserepesVirag csviragRepository) {
        this.csviragRepository = csviragRepository;
    }

    @Async
    public CompletableFuture<Optional<CserepesVirag>> findByIdCserepesVirag(String id) {
        return CompletableFuture.completedFuture(csviragRepository.findById(id));
    }
}
