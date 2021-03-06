package pl.politechnika.goalreacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.politechnika.goalreacher.entity.Event;
import pl.politechnika.goalreacher.service.EventService;

import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/{groupId}")
    public ResponseEntity<List<Event>> getAll(@PathVariable Long groupId) {
        return new ResponseEntity<>(eventService.getAllByGroupId(groupId), HttpStatus.OK);
    }
}
