package com.example.cserepesuzlet.domain.postservices;

import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import com.example.cserepesuzlet.persistency.repo.CserepesViragRepoInst;
import com.example.cserepesuzlet.persistency.repo.MemCserepesVirag;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class PostCserepesViragService {
    private final CserepesViragRepoInst csviragRepository;
    public PostCserepesViragService(MemCserepesVirag csviragRepository) {
        this.csviragRepository = csviragRepository;
    }

    @Async
    public CompletableFuture<CserepesVirag> insertCserepesVirag(CserepesVirag cserepesVirag) {
        return CompletableFuture.completedFuture(csviragRepository.save(cserepesVirag));
    }
}
