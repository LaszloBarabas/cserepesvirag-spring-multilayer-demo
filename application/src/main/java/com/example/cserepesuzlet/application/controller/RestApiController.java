package com.example.cserepesuzlet.application.controller;

import com.example.cserepesuzlet.domain.deleteservices.DeleteCserepesViragService;
import com.example.cserepesuzlet.domain.getservices.FindByIdService;
import com.example.cserepesuzlet.persistency.model.CserepesVirag;
import com.example.cserepesuzlet.domain.postservices.PostCserepesViragService;
import com.example.cserepesuzlet.domain.putservices.PutCserepesViragService;
import com.example.cserepesuzlet.domain.getservices.FindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/")
public class RestApiController {

    @Autowired
    FindAllService findAllService;
    @Autowired
    FindByIdService findByIdService;
    @Autowired
    PostCserepesViragService postCserepesViragService;
    @Autowired
    PutCserepesViragService putCserepesViragService;
    @Autowired
    DeleteCserepesViragService deleteCserepesViragService;

    public RestApiController() {}

    @GetMapping
    Iterable<CserepesVirag> getCserepesVirags() throws Exception {
        CompletableFuture<Iterable<CserepesVirag>> result = findAllService.findAllCserepesVirag();
        return result.get();
    }

    @GetMapping("/{id}")
    Optional<CserepesVirag> getCserepesViragById(@PathVariable String id) throws Exception {
        CompletableFuture<Optional<CserepesVirag>> result = findByIdService.findByIdCserepesVirag(id);
        return result.get();
    }

    @PostMapping
    CserepesVirag postCserepesVirag(@RequestBody CserepesVirag csvirag) throws Exception {
        CompletableFuture<CserepesVirag> result = postCserepesViragService.insertCserepesVirag(csvirag);
        return result.get();
    }

    @PutMapping("/{id}")
    ResponseEntity<CserepesVirag> putCserepesVirag(@PathVariable String id,
                                                   @RequestBody CserepesVirag csvirag) throws Exception {
        CompletableFuture<ResponseEntity<CserepesVirag>> result = putCserepesViragService.upsert(id, csvirag);
        return result.get();
    }

    @DeleteMapping("/{id}")
    void deleteCserepesVirag(@PathVariable String id) {
        deleteCserepesViragService.deleteCsVirag(id);
    }
}
