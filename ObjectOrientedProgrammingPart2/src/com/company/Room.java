package com.company;

import java.awt.*;

public class Room {
    private String type;
    private WINDOW window;
    private Speaker speaker;
    private Person person;

    public Room(WINDOW window, Speaker speaker, Person person) {
        this.window = window;
        this.speaker = speaker;
        this.person = person;
    }

    public void partyWithTheNeighborhood(String nameOfSong, int volume){
        party(nameOfSong, volume);
        window.openWindow();
        System.out.println("Neighbors now have fun and dance with " + person.getName());
    }

    private void party(String nameOfSong, int volume){
        speaker.playMusic(nameOfSong, volume);
        person.dance();
    }

    public String getType() {
        return type;
    }

    public WINDOW getWindow() {
        return window;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Person getPerson() {
        return person;
    }
}
