package CBD;
//all the operation is done here
//remove all except alphabet include special characters
public class Compute {

    public void Compute(String input){
        String output = input.replaceAll("[^a-zA-Z]","");//just keeps the alphabet only
        System.out.println(output);//prints the output
    }
}
