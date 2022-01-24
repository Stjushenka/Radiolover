public class Radio {

    private int minRadio = 0;
    private int maxRadio = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;
    private int currentStation;


    public int setCurrentStation(int currentStation) {
        this.currentStation = currentStation;

        if (currentStation >= maxRadio) {
            currentStation = maxRadio;
        }
        if (currentStation <= minRadio) {
            currentStation = minRadio;
        }

        return currentStation;
    }

    public int setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int nextStation() {
        if (currentStation == maxRadio) {
            currentStation++;
            this.currentStation = minRadio;
            return currentStation;
        }

        currentStation++;
        return currentStation;
    }

    public int prevStation() {
        if (currentStation == minRadio) {
            currentStation = maxRadio;
            return currentStation;
        }
        currentStation = currentStation - 1;


        return currentStation;
    }

    public int volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
            return currentVolume;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
            return currentVolume;
        }
        currentVolume = currentVolume - 1;
        return currentVolume;

    }
}

