package videoTutorial;


public class methodOverloading {
  public void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println("Addition is:" + c);
    }

    public void add(int x, double y) {
        double c;
        c = x + y;
        System.out.println("Addition is:" + c);
    }

    public void add(String x, String y) {
        String add = x + y;
        System.out.println("Concatenated string: " + add);
    }

    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        obj.add();
        obj.add(10, 10.20);
        obj.add("Hello", "World");
    }
}