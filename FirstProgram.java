
// public is an access modifier
// public - anyone has visibility and access to this class/method/variable
// private
// default
// protect

public class FirstProgram {
    // states (variables)
    // String variable ?    a sequence of characters


    // behaviors (methods)


    // this is a main method
    // it is the entry point of our entire application
    public static void main(String[] args){

        // String declaration
        // Data Type
        String nameOfString;

        // Initialization
        nameOfString = "Hello";

        // what is print()  -> is a method that we are calling
        // how do we call methods? -> by adding parentheses ()
        System.out.println(nameOfString); // -> Hello
        nameOfString = "Something else";
        System.out.println(nameOfString); // -> Second Line
        nameOfString = String.valueOf(7); // also just "7"

        System.out.print(nameOfString); // -> 7line
        System.out.print("line");
    }
}

