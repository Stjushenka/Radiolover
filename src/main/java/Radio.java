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


    public int nextStation() {
        if (currentStation == maxRadio) {
            currentStation++;
            currentStation = minRadio;
            return currentStation;
        }

        this.currentStation = currentStation ++;
        return currentStation;
    }

    public int prewStation() {
        if (currentStation == minRadio) {
            currentStation = maxRadio;
            return currentStation;
        }
        currentStation = currentStation -1;


        return currentStation;
    }

    public int volumeUp() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume++;
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