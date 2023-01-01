class Point{
    private final int x, y;
    private final String name;
    Point(int x, int y){

      System.out.println("Base cons entry");
        this.x=x;
        this.y=y;
        name = makeName();
        System.out.println("Base cons exit");
    }
    protected String makeName(){
      System.out.println("Inside base make name");
        return "["+x+","+y+"]";
    }
    public final String toString(){
        return name;
    }
}
public class ColorPoint extends Point{
    private final String color;
    ColorPoint(int x, int y, String color){
        //System.out.println("Derived Class entry");
        super(x,y);//the problem, eberything happens before color is initialized

        System.out.println("derived cons after super call");
        this.color=color;
        System.out.println("Derived cons exit");
    }
    protected String makeName(){
      System.out.println("Inside derived make name");
        return super.makeName()+":"+color;
    }
    public static void main(String args[]){
        System.out.print(new ColorPoint(4,2,"purple"));
    }
}
/* Questions
 * Q1---> Does the super keyword work, given that the varibales defined (x, y) are private?
 * Q2---> Constructor inherited or not?
 * Q3---> Why is the color not printed, why is it null?
 *
 */
/* Lessons learnt
 * The problem arises whenever a constructor calls a method that has been overridden in its subclass.
 * A method invoked in this way always runs before the instance has been initialized, when its declared fields still have their default values.
 * To avoid this problem, never call overridable methods from constructors, either directly or indirectly (makeName() method for example)
 */
