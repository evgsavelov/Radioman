package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void checkNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void checkPrevRadioStation() {
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
        radio.setCurrentSoundVolume(10);
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