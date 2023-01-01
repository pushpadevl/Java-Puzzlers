
public class P82_BeerBlast {
    static final String COMMAND = "java P82_BeerBlast slave";
    static final String C2 = "rm P82_filetobeDeleted";
    public static void main(String[] args) throws Exception{
        if(args.length==1 && args[0].equals("slave")){
            for(int i=99;i>0;i--){
                System.out.println(i+" bottles of beer on the wall");
                System.out.println(i+" bottles of beer");
                System.out.println("You take one down, pass it around.");
                System.out.println((i-1)+" bottles of beer on the wall");
                System.out.println();
            }
        }else{
            //MAster
            Process process = Runtime.getRuntime().exec(C2); //peforms BASH operations 
            int exitValue = process.waitFor();
            System.out.println("exit value = " +exitValue);
        }
    }
}
