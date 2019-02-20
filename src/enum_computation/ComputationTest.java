package enum_computation;

public class ComputationTest {

    public static void main(String args []){

        System.out.print(Computation.ADD.perform(5, -5));
        System.out.print(Computation.DIVIDE.perform(2, -5));
        System.out.print(Computation.MULTIPY.perform(2, -5));
        System.out.print(Computation.SUBTRACT.perform(2, -5));

    }

}
