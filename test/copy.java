public class copy {
    public static Sale[] bad(Sale[] a) {
        Sale[] b = new Sale[a.length];
        for (int i=0; i<a.length; i++)
            b[i] = new Sale(a[i]);
        return b;
    }

    public static Sale[] good(Sale[] a) {
        Sale[] b = new Sale[a.length];
        for (int i=0; i<a.length; i++)
            b[i] = a[i].clone();
        return b;
    }
}
