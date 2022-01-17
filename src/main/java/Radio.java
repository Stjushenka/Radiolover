public class Radio {

    private int minRadio = 0;
    private int maxRadio = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    public int currentVolume;
    public int currentStation;
    private int maxStation;


    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if(currentStation <= 0) {
            return minRadio;
        }
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

        if (currentVolume == maxVolume) {
            currentVolume ++;
            currentVolume = maxVolume;
            return currentVolume;
        }
        currentVolume++;

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

