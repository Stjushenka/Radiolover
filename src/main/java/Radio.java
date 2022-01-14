public class Radio {

    int minRadio;
    int maxRadio;
    int minVolume;
    int maxVolume;
    public int currentVolume;
    public int currentStation;

    public Radio() {
    }

    public Radio(int minRadio, int maxRadio, int minVolume, int maxVolume, int currentStation, int currentVolume) {
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int setCurrentStation() {
        this.currentStation = currentStation;
        return currentStation;
    }


    public int nextStation() {
        if (currentStation == maxRadio) {
            currentStation++;
            this.currentStation = minRadio;
            return currentStation;
        }

        currentStation ++;
        return currentStation;
    }

    public int prevStation() {
        if (currentStation == minRadio) {
            currentStation = maxRadio;
            return currentStation;
        }
        currentStation = currentStation -1;


        return currentStation;
    }

    public int volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
            return currentVolume;
        }
        else {
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

