//package hack;
import click.CodeTalk;

public class TypeIt{
    private static class ClickIt extends CodeTalk{
        /*public*/ void printMessage(){
            System.out.println("Hack");
        }
    }
    public static void main(String[] args){
        ClickIt clickit = new ClickIt();
        clickit.doIt();
    }
}
/*
both printMessage methods may be declared public, both may be declared
protected, or the superclass method may be declared protected and the sub-
class method public. If any of these three changes is made, the program will print
Hack, indicating that overriding is taking place.
*/