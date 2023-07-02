package com.geekster.H2fun.controller;
import com.geekster.H2fun.services.EventService;
import com.geekster.H2fun.models.Event;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class EventController{
    @Autowired
    EventService eventService;

    @GetMapping(value = "/Event")
    public Iterable<Event> getEvents(){
        return eventService.getAllEvent();
    }
    @GetMapping(value = "/Event/{eventId}")
    public void getEventById( @PathVariable Integer eventId){ eventService.getEventById(eventId);
    }
    @PostMapping(value = "/Event")
    public void addEvent(@Valid @RequestBody Event event){
        eventService.addEvent(event);
    }

    @PostMapping(value = "/Events")
    public void addAllEvent(@Valid @RequestBody List<Event> events){
         eventService.addAllEvent(events);
    }
    @DeleteMapping(value ="/Event/{eventId}")
    public void removeById(@PathVariable Integer eventId){
        eventService.removeEventById(eventId);
    }

}
