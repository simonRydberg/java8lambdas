/**
 * Created by simonrydberg on 09/03/15.
 */
public class RunnableThis {
    private Object outerScope = this;
    final Runnable anonymous = new Runnable() {

        @Override
        public void run() {
            System.out.println("Anonymous: \t" + (this == outerScope));
        }
    };

}
