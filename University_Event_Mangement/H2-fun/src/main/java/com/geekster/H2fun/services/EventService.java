package com.geekster.H2fun.services;

import com.geekster.H2fun.models.Event;
import com.geekster.H2fun.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepository eventRepository;

    public Iterable<Event> getAllEvent() {
        return eventRepository.findAll();
    }

    public void addEvent(Event event) {
         eventRepository.save(event);
    }

    public void removeEventById(Integer eventId) {
        eventRepository.deleteById(eventId);
    }

    public void getEventById(Integer eventId) {
        eventRepository.findById(eventId);

    }
    public void addAllEvent(List<Event> events) {
        eventRepository.saveAll(events);
    }
}
