public class Radio {

    private int minRadio = 0;
    private int maxRadio = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    public int currentVolume;
    public int currentStation;
    public int maxStation;


    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation+1;
    }


    public int setCurrentStation(int currentStation) {
        if(currentStation > maxStation) {
            currentStation = maxStation;
            return currentStation;
        }
        if(currentStation < maxStation) {
            return currentStation;
        }
        if(currentStation <= minRadio) {
            this.currentStation = minRadio;
        }

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

