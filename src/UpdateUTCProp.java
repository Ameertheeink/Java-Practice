

import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.OutputStream;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Properties;
import java.util.TimeZone;


public class UpdateUTCProp {
    public static void main(String[] args) {
        // Create a SimpleDateFormat with the desired time zone (UTC+5:30)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC+05:30"));

        // Get the current time in the specified time zone
        Date currentTime = new Date();
        String currentTimeStr = sdf.format(currentTime);

        System.out.println("Current Time (UTC-5:30): " + currentTimeStr);
    }
}
