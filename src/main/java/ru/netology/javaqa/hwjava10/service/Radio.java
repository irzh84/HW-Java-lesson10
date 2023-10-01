package ru.netology.javaqa.hwjava10.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int stationNumber = minStation;
    private int howMuchStation = 10;
    private int volume = 20;

    public Radio(int howMuchStation) {
        maxStation = minStation + howMuchStation - 1;
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



