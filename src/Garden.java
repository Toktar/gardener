/**
 * Created by Kida on 29.04.2016.
 */
public class Garden {
    private static Garden ourInstance = new Garden();

    public static Garden getInstance() {
        return ourInstance;
    }

    private Garden() {

    }
}
