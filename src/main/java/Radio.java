public class Radio {

    int minRadio;
    int maxRadio;
    public int currentVolume;
    int minVolume;
    int maxVolume;
    public int currentStation;


    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
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
        this.currentVolume = currentVolume;
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
            return currentVolume;
        }
        else {
            currentVolume = minVolume;
        }
        return currentVolume;

    }
}

