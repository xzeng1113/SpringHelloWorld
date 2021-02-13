package com.leapcode.repository;

import com.leapcode.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Teng");
        speaker.setLastName("Long");
        speakers.add(speaker);

        return speakers;
    }
}
