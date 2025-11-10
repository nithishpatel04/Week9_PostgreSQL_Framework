package com.npv.week9.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.npv.week9.Repository.RoomRepository;
import com.npv.week9.models.Rooms;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomRepository repo;
    public RoomController(RoomRepository repo) { this.repo = repo; }

    // (1) CREATE room
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Rooms create(@RequestBody Rooms room) {
        return repo.save(room);
    }

    // (2) LIST all rooms
    @GetMapping
    public List<Rooms> findAll() {
        return repo.findAll();
    }
}
