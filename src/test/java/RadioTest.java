import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(1);

        vol.increaseVolume();

        int expected = 2;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(100);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceMinVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(0);

        vol.reduceVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio vol = new Radio();
        vol.setCurrentVolume(2);

        vol.reduceVolume();

        int expected = 1;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);

        stat.increaseRadioStation();

        int expected = 1;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

        stat.setCurrentRadioStation(1);
        stat.increaseRadioStation();

        expected = 2;
        actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

        stat.setCurrentRadioStation(8);
        stat.increaseRadioStation();

        expected = 9;
        actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGoFromMaxRadioStationToMinRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(9);

        stat.increaseRadioStation();

        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoFromMinRadioStationToMaxRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(0);

        stat.reduceRadioStation();

        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(1);

        stat.reduceRadioStation();

        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

        stat.setCurrentRadioStation(9);

        stat.reduceRadioStation();

        expected = 8;
        actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

        stat.setCurrentRadioStation(8);

        stat.reduceRadioStation();

        expected = 7;
        actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incorrectHighRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);

        stat.reduceRadioStation();

        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incorrectLowRadioStation() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);

        stat.increaseRadioStation();

        int expected = 1;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStation() {
        Radio stat = new Radio(26);
        stat.setCurrentRadioStation(20);


        int expected = 20;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNotContainCurrentRadioStation() {
        Radio stat = new Radio(26);
        stat.setCurrentRadioStation(28);


        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
}




