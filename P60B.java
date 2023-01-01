public class P60B {
    public static void main(String []args){
    String[] in = ("fear, surprise, ruthless efficiency, an almost fanatical devotion to the Pope, nice red uniforms").split(",(\s)+");
    for(String s:in){
        System.out.println(s+" ");
    }
}

}
