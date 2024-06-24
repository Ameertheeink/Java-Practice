import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


public class UpdatePropFile {
    public static void main(String[] args) {

        Properties prop=new Properties();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        try {
            prop.load(new FileInputStream("E:\\JAVA_Practice\\JAVA_Practice\\src\\credit.properties"));
            OutputStream outputStream = new FileOutputStream("E:\\JAVA_Practice\\JAVA_Practice\\src\\credit.properties");
            prop.setProperty("lastrun",currentTime);
            prop.store(outputStream,null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
