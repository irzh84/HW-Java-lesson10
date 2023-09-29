package ru.netology.javaqa.hwjava10.service;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int stationNumber = minStation;
    private int howMuchStation = 10;

    public Radio (int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.stationNumber = minStation;

    }
    public Radio(int howMuchStation) {
        this.howMuchStation = howMuchStation;

    }

    public Radio() {
        this.howMuchStation = howMuchStation;
    }

    private int volume = 20;

    public int getMinStation() {
        return minStation;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public int getStationNumber() {
        return stationNumber;
    }
    public int getHowMuchStation() {return howMuchStation;}

    public int getVolume() {
        return volume;
    }

    public void setCurrentStation(int currentStationNumber) {
        if (currentStationNumber > maxStation) {
            return;
        }
        if (currentStationNumber < minStation) {
            return;
        }
        stationNumber = currentStationNumber;
    }

    public void next() {
        int nextStation = stationNumber + 1;
        if (nextStation > maxStation) {
            nextStation = minStation;
        }
        setCurrentStation(nextStation);
    }

    public void prev() {
        int prevStation = stationNumber - 1;
        if (prevStation < minStation) {
            prevStation = maxStation;
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



