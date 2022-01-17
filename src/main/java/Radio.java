public class Radio {


    private int minRadio = 0;
    public int maxRadio;
    private int minVolume = 0;
    private int maxVolume = 100;
    public int currentVolume;
    public int currentStation;


    public Radio() {
    }

    public Radio(int maxRadio) {
        this.maxRadio = maxRadio+1;
    }


    public int setCurrentStation(int currentStation) {
        if(currentStation > maxRadio) {
            currentStation = maxRadio;
            return currentStation;
        }
        if(currentStation < maxRadio) {
            return currentStation;
        }
        else {
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

