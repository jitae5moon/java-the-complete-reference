package part01.chapter03;

// var is context-sensitive identifier.(Only used with local variables)
// var can be used to declare a variable only when that variable is initialized.
public class VarDemo {

    public static void main(String[] args) {
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        int var = 1;
        System.out.println("Value of var: " + var);

        var k = -var;
        System.out.println("Value of k: " + k);
    }

}
