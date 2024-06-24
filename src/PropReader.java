import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropReader {
    public static void main(String[] args) {
        Properties prop=new Properties();
        String userName;
        String passWord;

        try {
            prop.load(new FileInputStream("E:\\JAVA_Practice\\JAVA_Practice\\src\\credit.properties"));
//
//            Set<Map.Entry<Object, Object>> entrySet = prop.entrySet();
//            for (Map.Entry<Object, Object> entry : entrySet) {
//                String key = (String) entry.getKey();
//                String value = (String) entry.getValue();
//                System.out.println(key + ": " + value);
//            }

            Set<Object> set = prop.keySet();

            System.out.println("Reading all key values from properties file \n");

            for(Object o: set){
                String key = (String)o;
                System.out.println("key: "+key+" \n value "+prop.getProperty(key));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
