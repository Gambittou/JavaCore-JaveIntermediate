package Liskov;

public class Owl {
	private int altitude;

    public void fly() {
        this.setAltitude(this.getAltitude() + 1000);
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}