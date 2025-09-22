class generic<T1> {
    private T1 t1;

    public generic(T1 t1) {
        this.t1 = t1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics {
    public static void main(String[] args) {
        generic<String> g1 = new generic("This is the string");
        String s = g1.getT1();
        System.out.println(s);
    }
}
