package DependancyInversion;

public class Email {
	public String generateWeatherAlert(String conditions) {
        String alert = "It is " + conditions;
        return alert;
    }
}