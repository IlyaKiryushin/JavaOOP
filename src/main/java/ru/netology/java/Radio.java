package ru.netology.java;

public class Radio {
    public int currentFrequency;
    public int currentVolume;

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentFrequency(int newCurrentFrequency) {
        if (newCurrentFrequency > 9) {
            return;
        }
        if (newCurrentFrequency < 0) {
            return;
        }
        currentFrequency = newCurrentFrequency;
    }

    public void next() {
        if (currentFrequency < 9) {
            currentFrequency = currentFrequency + 1;
        } else currentFrequency = 0;
    }

    public void prev() {
        if (currentFrequency > 0) {
            currentFrequency = currentFrequency - 1;
        } else currentFrequency = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void louderVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void quieterVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
