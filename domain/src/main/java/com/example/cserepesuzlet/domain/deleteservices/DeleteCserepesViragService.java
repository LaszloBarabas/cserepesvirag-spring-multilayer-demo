package com.example.cserepesuzlet.domain.deleteservices;

import com.example.cserepesuzlet.persistency.repo.CserepesViragRepoInst;
import com.example.cserepesuzlet.persistency.repo.MemCserepesVirag;
import org.springframework.stereotype.Service;

@Service
public class DeleteCserepesViragService {
    private final CserepesViragRepoInst csviragRepository;
    public DeleteCserepesViragService(MemCserepesVirag csviragRepository) {
        this.csviragRepository = csviragRepository;
    }

    public void deleteCsVirag(String id) {
        csviragRepository.deleteById(id);
    }
}
