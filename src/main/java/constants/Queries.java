package constants;

public class Queries {
    public static String getdata(String key, String value) {
        String result = "SELECT data from request_data where " + key + "='" + value + "'";
        return result;
    }
}
