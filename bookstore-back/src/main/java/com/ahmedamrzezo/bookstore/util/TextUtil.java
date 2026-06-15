
public class TextUtil {

	public String sanitize(String input) {
		if (input == null) {
			return null;
		}
		return input.replaceAll("[^a-zA-Z0-9\\s]", "").trim();
	}

}
