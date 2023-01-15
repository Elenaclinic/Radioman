public class Radio {

    private int currentVolume;
    private int currentRadioStation;
    private int maxStation;

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < 0) {
            return;
        }
        if (CurrentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseRadioStation() {
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }
}
