
class CheckArguement extends Exception{
    public CheckArguement(String message){
        super(message);
    }
}
public class lab6_5 {
    public static void main(String[] args) {
        try{
            if(args.length < 4){
                throw new CheckArguement("Please provide 4 numbers as command line arguments.");

            }
            else{
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int num3 = Integer.parseInt(args[2]);
                int num4 = Integer.parseInt(args[3]);
                int sum=0;
                for(int i=0;i<args.length;i++){
                    sum+=Integer.parseInt(args[i])*Integer.parseInt(args[i]);
                }
                System.out.println("Sum of squares: " + sum);
            }
        }
        catch(CheckArguement e){
            System.out.println(e);
        }
         catch(NumberFormatException e){
            System.out.println("Please ensure all command line arguments are valid integers.");
        }
    }
}
