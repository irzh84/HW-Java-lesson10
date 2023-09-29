package ru.netology.javaqa.hwjava10.service;

public class Radio {
    private int stationNumber;
    private int volume = 20;

    public int getStationNumber() {
        return stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentStation(int currentStationNumber) {
        if (currentStationNumber >= 10) {
            return;
        }
        if (currentStationNumber < 0) {
            return;
        }
        stationNumber = currentStationNumber;
    }

    public void next() {
        int nextStation = stationNumber + 1;
        if (nextStation == 10) {
            nextStation = 0;
        }
        setCurrentStation(nextStation);
    }

    public void prev() {
        int prevStation = stationNumber - 1;
        if (prevStation < 0) {
            prevStation = 9;
        }
        setCurrentStation(prevStation);
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= 101) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        volume = currentVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

}



