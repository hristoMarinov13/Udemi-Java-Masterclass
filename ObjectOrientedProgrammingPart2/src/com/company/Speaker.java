package com.company;

public class Speaker {
    private String manufacturer;
    private int wats;


    public Speaker(String manufacturer, int wats) {
        this.manufacturer = manufacturer;
        this.wats = wats;

    }

    public void playMusic(String nameOfSong, int volume){
        System.out.println("Speaker now plays " + nameOfSong + " at volume " + volume);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWats() {
        return wats;
    }
}
