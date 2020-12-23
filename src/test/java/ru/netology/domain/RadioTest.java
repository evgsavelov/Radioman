package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void checkNextRadioStationBoundaryValue() {
        Radio radio = new Radio(12,12,50);
        //radio.setCurrentRadioStation(12);
        radio.nextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void checkNextRadioStation() {
        Radio radio = new Radio(50, 8, 50);
        //radio.setCurrentRadioStation(6);
        radio.nextRadioStation();
        assertEquals(9,radio.getCurrentRadioStation());
    }

    @Test
    void checkPrevRadioStation() {
        Radio radio = new Radio(50, 50, 50);
        //radio.setCurrentRadioStation(6);
        radio.prevRadioStation();
        assertEquals(49, radio.getCurrentRadioStation());
    }

    @Test
    void checkPrevRadioStationBoundaryValue() {
        Radio radio = new Radio(70, 0, 50);
        //radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(70, radio.getCurrentRadioStation());
    }

    @Test
    void checkSetCurrentRadioStation() {
        Radio radio = new Radio(50, 6, 50);
        //radio.setCurrentRadioStation(10);
        assertEquals(6, radio.getCurrentRadioStation());

    }

    @Test
    void checkIncreaseSoundVolume() {
        Radio radio = new Radio(50, 6, 100);
        //radio.setCurrentSoundVolume(9);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void checkDecreaseSoundVolume() {
        Radio radio = new Radio(50, 6, 0);
        //radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}