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

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }


    public int nextStation(int currentStation) {
        if (currentStation == maxRadio) {
            currentStation++;
            currentStation = minRadio;
            return currentStation;
        }

            this.currentStation = currentStation ++;
        return currentStation;
    }

    public int prewStation(int currentStation) {
        if (currentStation == minRadio) {
            currentStation = maxRadio;
            return currentStation;
        }
        currentStation = currentStation -1;


        return currentStation;
    }

    public int volumeUp(int currentVolume) {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume++;
        }
        return currentVolume;
    }

    public int volumeDown(int currentVolume) {
        this.currentVolume = currentVolume;
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;

    }
}

