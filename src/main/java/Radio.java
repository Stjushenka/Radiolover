public class Radio {

    public int minRadio = 0;
    public int maxRadio = 9;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;
    public int currentStation;
    private int radioStation;

    public void setCurrentStation(int currentStation) {
        if (currentStation <= maxRadio && currentStation >= minRadio) {
            radioStation = currentStation;
        } else {
            return;
        }

    }

    public int nextStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation == maxRadio) {
            currentStation++;
            currentStation = minRadio;

        }
        return currentStation;
    }

    public int prewStation(int currentStation) {
        this.currentStation = currentStation;
        if (currentStation == minRadio) {
            currentStation = currentStation - 1;
            currentStation = maxRadio;
        }
        return currentStation;
    }

    public int volumeUp(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int volumeDown(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume != minVolume) {
            currentVolume = currentVolume -1;
        }
        return currentVolume;

    }
}

