package com.npv.week9.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.npv.week9.Repository.GuestsRepository;
import com.npv.week9.models.Guests;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestsController {

    private final GuestsRepository repo;

    public GuestsController(GuestsRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Guests create(@RequestBody Guests guest) {
        return repo.save(guest);
    }

    @GetMapping
    public List<Guests> findAll() {
        return repo.findAll();
    }
}

