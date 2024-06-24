public class Likes {
    public static void main(String[] args) {
        String[] participants={"peter","jacob","ramesh"};
        System.out.println(likes(participants));
    }
    public static String likes(String[] names){

        if(names.length==0){
            return "Number of persons "+names.length;
        }
else if(names.length==1){
    return names[0]+" likes this";
        }
        else if(names.length==2){
            return names[0]+" and "+names[1]+"likes this";
        }
        else if(names.length==3){
            return names[0]+","+names[1]+" and "+names[2]+" likes this";
        }
        return names[0]+","+names[1]+" and "+(names.length-2)+" others like this";
    }
}
