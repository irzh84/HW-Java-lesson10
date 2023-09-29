package ru.netology.javaqa.hwjava10.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetStationNormal() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(9);

        int expected = 9;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void shouldSetStationAbove() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(10);

        int expected = 0;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void shouldSetStationUnder() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(-1);

        int expected = 0;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void nextTest() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(6);
        fm.next();

        int expected = 7;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void nextTestNine() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(9);
        fm.next();

        int expected = 0;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void prevTest() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(6);
        fm.prev();

        int expected = 5;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void prevTestZero() {
        Radio fm = new Radio(0,9);

        fm.setCurrentStation(0);
        fm.prev();

        int expected = 9;
        int actual = fm.getStationNumber();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }
/*
    @Test
    public void shouldSetVolumeNormal() {
        Radio fm = new Radio();

        fm.setVolume(40);

        int expected = 40;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void shouldSetVolumeAbove() {
        Radio fm = new Radio();

        fm.setVolume(101);

        int expected = 20;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void shouldSetVolumeUnder() {
        Radio fm = new Radio();

        fm.setVolume(-1);

        int expected = 20;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void increaseTest() {
        Radio fm = new Radio();

        fm.setVolume(60);
        fm.increaseVolume();

        int expected = 61;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void increaseTestHundred() {
        Radio fm = new Radio();

        fm.setVolume(100);
        fm.increaseVolume();

        int expected = 100;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void decreaseTest() {
        Radio fm = new Radio();

        fm.setVolume(80);
        fm.decreaseVolume();

        int expected = 79;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }

    @Test
    public void decreaseTestZero() {
        Radio fm = new Radio();

        fm.setVolume(0);
        fm.decreaseVolume();

        int expected = 0;
        int actual = fm.getVolume();

        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }


     */
    @Test
    public void howMuchStationTest() {
        Radio fm = new Radio(10);

        Assertions.assertEquals(10, fm.getHowMuchStation());
    }

    @Test
    public void howMuchStationTest2() {
        Radio fm = new Radio();

        Assertions.assertEquals(10, fm.getHowMuchStation());
    }
}