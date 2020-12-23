package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void checkNextRadioStationBoundaryValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void checkNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.nextRadioStation();
        assertEquals(7,radio.getCurrentRadioStation());
    }

    @Test
    void checkPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.prevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void checkPrevRadioStationBoundaryValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void checkSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    void checkIncreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);
        radio.increaseSoundVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void checkDecreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}