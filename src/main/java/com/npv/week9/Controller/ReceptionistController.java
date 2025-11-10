package com.npv.week9.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.npv.week9.Repository.ReceptionistRepository;
import com.npv.week9.models.Receptionist;

import java.util.List;

@RestController
@RequestMapping("/api/receptionists")
public class ReceptionistController {
    private final ReceptionistRepository repo;
    public ReceptionistController(ReceptionistRepository repo) { this.repo = repo; }

    // (1) CREATE receptionist
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Receptionist create(@RequestBody Receptionist r) {
        return repo.save(r);
    }

    // (2) LIST all receptionists
    @GetMapping
    public List<Receptionist> findAll() {
        return repo.findAll();
    }
}