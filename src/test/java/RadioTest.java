import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {

    @Test
    public void shouldUseRadio() {
        Radio rad1 = new Radio(0,9, 0,100,5, 50);

        assertEquals(5, rad1.setCurrentStation(5));

        Radio rad2 = new Radio(0,9, 0,100,9, 50);

        assertEquals(9, rad2.setCurrentStation(9));

        Radio rad3 = new Radio(0,9, 0,100,5, 100);

        assertEquals(100, rad3.setCurrentVolume(100));

        Radio rad4 = new Radio(0,9, 0,100,5, 0);

        assertEquals(0, rad4.setCurrentVolume(0));
    }


    @Test
    public void shouldUseConstructor() {
        Radio rad0 = new Radio(20);
        int actual = rad0.setRadioStation(15);

        assertEquals(14, actual);

        Radio rad1 = new Radio(5);
        actual = rad1.setRadioStation(2);

        assertEquals(1, actual);

        Radio rad2 = new Radio(30);
        actual = rad2.setRadioStation(22);

        assertEquals(21, actual);

        Radio rad3 = new Radio(1);
        actual = rad3.setRadioStation(1);

        assertEquals(0, actual);

        Radio rad4 = new Radio(43);
        actual = rad4.setRadioStation(43);

        assertEquals(42, actual);
    }


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.setMaxRadio(9);
        int actual = rad.setCurrentStation(9);
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio();
        int actual = rad.setCurrentStation(0);
        assertEquals(0, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setMaxRadio(9);
        int actual = rad.nextStation();
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setMaxRadio(9);
        int actual = rad.nextStation();
        assertEquals(1, actual);
    }


    @Test
    public void prewStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setMaxRadio(9);
        int actual = rad.prevStation();
        assertEquals(9, actual);
    }

    @Test
    public void prewStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int actual = rad.prevStation();
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int actual = rad.volumeUp();
        assertEquals(100, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int actual = rad.volumeUp();
        assertEquals(1, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int actual = rad.volumeDown();
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setMaxRadio(100);
        int actual = rad.volumeDown();
        assertEquals(99, actual);
    }

}