public class Radio {


    private int radioStation;
    private int minRadio = 0;
    private int maxRadio;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int currentStation;
    private int countRadio;




    public Radio() {
    }

    public Radio(int countRadio) {
        this.countRadio = maxRadio -1;
    }


    public int setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        if(currentStation > maxRadio) {
            currentStation = maxRadio;
        }

        return currentStation;
    }


    public int setRadioStation(int currentStation) {
        this.radioStation = currentStation-1;
        return radioStation;
    }

    public void setMaxRadio(int maxRadio) {
        this.maxRadio = maxRadio;
    }

    public int nextStation() {
        if(currentStation < maxRadio) {
            currentStation++;
        }
        if (currentStation == maxRadio) {
                this.currentStation = minRadio;
        }


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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
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


