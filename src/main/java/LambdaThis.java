/**
 * Created by simonrydberg on 09/03/15.
 */
public class LambdaThis {
    private Object outerScope=this;
    final Runnable lambda = ()-> System.out.println("Lambda: \t" + (this== outerScope));
}
