package bridge;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Maps {

	public String getMap(String address) {
		try {
			String googleMaps = "http://maps.google.com.br";
			URL url;
			url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			//...read openStream
			return googleMaps;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
