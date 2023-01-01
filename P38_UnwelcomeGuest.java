public class P38_UnwelcomeGuest{
    
    public static final long GUEST_USER_ID = -1;
    private static final long USER_ID;
    
    //What is this block doing? Why
    static {
        try {
            USER_ID=getUserIdFromEnvironment();
        }catch (IdUnavailableException e){
            USER_ID=GUEST_USER_ID;
            System.out.print("[+] Logging in as Guest.");
        }
    }
    private static long getUserIdFromEnvironment() throws IdUnavailableException{
        throw new IdUnavailableException(); //SImulating an error
    }
    /* SOLUTION
    public static final long GUEST_USER_ID = -1;
    private static final long USER_ID = getUserIdOrGuest();
    private static long getUserIdOrGuest() {
        try {
        return getUserIdFromEnvironment();
    } catch (IdUnavailableException e) {
        System.out.println("Logging in as guest");
        return GUEST_USER_ID;
        }
    }
    */

    public static void main(String []args){
        System.out.println("User ID: "+USER_ID);
    }
}
class IdUnavailableException extends Exception{ //making a CHECKED excp class, for unchecked, extend RuntimeException
    IdUnavailableException(){}
}