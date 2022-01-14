import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    int minRadio;
    int maxRadio;
    int minVolume;
    int maxVolume;
    public int currentVolume;
    public int currentStation;

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
        this.currentVolume = currentVolume;
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;

    }

}