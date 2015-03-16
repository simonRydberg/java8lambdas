package se.simpor;

/**
 * Created by simonrydberg on 09/03/15.
 */
public class ScopelessLambda {
    final Object outerScope = this;
    final Runnable lambda = ()-> System.out.println("Lambda: \t" + (this==outerScope));
    final Runnable lambdaBlock = ()-> {
        System.out.println("lambdaBlock: \t" + (this==outerScope));
    };
    final Runnable anonymous = new Runnable() {

        @Override
        public void run() {
            System.out.println("Anonymous: \t" + (this==outerScope));
        }
    };

    public static void main(final String[] args) {
        new ScopelessLambda().go();
    }

    public void go() {
        System.out.println("this: \t" + (this==outerScope)); // true
        lambda.run(); // true
        lambdaBlock.run(); // true
        anonymous.run(); // false
    }

}
