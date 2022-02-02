import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int minRadio;
    private int maxRadio;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;
    private int currentStation;

    public int setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
        return currentStation;
    }

    public int setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
        return currentVolume;
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
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;

    }

}