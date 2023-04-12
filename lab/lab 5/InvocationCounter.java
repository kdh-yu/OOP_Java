public class InvocationCounter {
    private static int numberOfInvocations = 0;

    public void demoMethod() {
        numberOfInvocations++;
    }
    public void outPutCount() {
        numberOfInvocations++;
        System.out.println("Number of invocations so far = " + numberOfInvocations);
    }
    public static int numberSoFar() {
        numberOfInvocations++;
        return numberOfInvocations;
    }

    public static void main(String[] args) {
        InvocationCounter object1 = new InvocationCounter();
        for (int i=0; i<5; i++)
            object1.demoMethod();
        object1.outPutCount();

        InvocationCounter object2 = new InvocationCounter();
        for (int i=0; i<5; i++) {
            object2.demoMethod();
            object2.outPutCount();
        }
        System.out.println("Total number of invocations = " + numberSoFar());
    }
}
