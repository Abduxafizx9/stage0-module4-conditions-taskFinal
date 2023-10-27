package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider==0)
            System.out.println("division by zero");
        int result = dividend/divider;
        int dividend1 = result*divider;
        switch (dividend-dividend1)
        {
            case 0:
                System.out.println("can be divided completely");
                break;
            default:
                System.out.println("cannot be divided completely");

        }
    }
}
