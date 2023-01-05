package com.example.cserepesuzlet.domain.getservices;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import com.example.cserepesuzlet.persistency.repo.CserepesViragRepoInst;
import com.example.cserepesuzlet.persistency.repo.MemCserepesVirag;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service

public class FindAllService {
    private final CserepesViragRepoInst csviragRepository;
    public FindAllService(MemCserepesVirag csviragRepository) {
        this.csviragRepository = csviragRepository;
    }

    @Async
    public CompletableFuture<Iterable<CserepesVirag>> findAllCserepesVirag() {
        return CompletableFuture.completedFuture(csviragRepository.findAll());
    }
}
