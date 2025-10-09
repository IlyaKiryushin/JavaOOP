package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(30);

    @Test
    public void shouldSetFrequency() {
        radio.setCurrentFrequency(3);
        int expected = 3;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequencyIf0() {
        radio.setCurrentFrequency(0);
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequencyIfMax() {
        radio.setCurrentFrequency(29);
        int expected = 29;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequencyIfMoreMax() {
        radio.setCurrentFrequency(30);
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequencyIf8() {
        radio.setCurrentFrequency(8);
        int expected = 8;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequencyIf1() {
        radio.setCurrentFrequency(1);
        int expected = 1;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFrequencyIfLessMin() {
        radio.setCurrentFrequency(-1);
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseFrequencyOnOnebyMax() {
        radio.setCurrentFrequency(29);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseFrequencyOnOnebyMiddle() {
        radio.setCurrentFrequency(3);
        radio.next();
        int expected = 4;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseFrequencyOnOnebyMin() {
        radio.setCurrentFrequency(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceFrequencyOnOnebyMin() {
        radio.setCurrentFrequency(0);
        radio.prev();
        int expected = 29;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceFrequencyOnOnebyMiddle() {
        radio.setCurrentFrequency(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceFrequencyOnOnebyMax() {
        radio.setCurrentFrequency(29);
        radio.prev();
        int expected = 28;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(35);
        int expected = 35;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfMax() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfMin() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSetVolumeOnOnebyMax() {
        radio.setCurrentVolume(100);
        radio.louderVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSetVolumeOnOnebyMiddle() {
        radio.setCurrentVolume(35);
        radio.louderVolume();
        int expected = 36;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSetVolumeOnOnebyMin() {
        radio.setCurrentVolume(0);
        radio.louderVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceSetVolumeOnOnebyMax() {
        radio.setCurrentVolume(100);
        radio.quieterVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceSetVolumeOnOnebyMiddle() {
        radio.setCurrentVolume(36);
        radio.quieterVolume();
        int expected = 35;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceSetVolumeOnOnebyMin() {
        radio.setCurrentVolume(0);
        radio.quieterVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
