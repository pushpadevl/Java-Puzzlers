public class MinutebyMinute35{
    public static void main(String []args){
        int minutes=0;
        for(int ms=0;ms<60*60*1000;ms++){
            if(ms%60*1000==0){
                minutes++;
            }
        }
        System.out.println(minutes);
    }
}
/*== 0). You might
think that this expression is equivalent to (ms % 60000 == 0), but it isn’t. The
remainder and multiplication operators have the same precedence [JLS 15.17], so
the expression ms % 60*1000 is equivalent to (ms % 60) * 1000. This expr
*/