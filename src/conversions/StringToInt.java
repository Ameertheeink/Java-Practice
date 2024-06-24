package conversions;

public class StringToInt {
    public static void main(String[] args) {
        String data="456";
        try{
            int i=Integer.parseInt(data);
            System.out.println(i+" Succesfully converted as integer from String");
        }catch (NumberFormatException e){
            System.out.println("conversion failed");
        }


    }
}
