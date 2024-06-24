import java.util.Scanner;

public class ArraySample {


    public static void main(String[] args) {
        int numberOfAgents=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Agents:");

numberOfAgents=sc.nextInt();
        String[] agentNames=new String[numberOfAgents];
        System.out.println("Number of Agents:"+agentNames.length);

       for(int i=0;i<agentNames.length;i++){
           System.out.println("Enter number of AgentName:");
           agentNames[i]=sc.next();
       }
        for(int i=0;i<agentNames.length;i++){
            System.out.println("agentName"+(i+1)+" :"+agentNames[i]);
        }


    }
}
