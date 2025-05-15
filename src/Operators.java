public class Operators {
    public static void main(String[] args) {
        int x = 10;
        x++; //post increment operator
        System.out.println(x);//11
        ++x;
        System.out.println(x);//12

        --x;
        System.out.println(x);//11
        x--;
        System.out.println(x);//10
        System.out.println("-----");
        System.out.println(x++);//10
        System.out.println(x);//11
        System.out.println(x++);//11
        System.out.println(x);//12
        System.out.println(x--);//12
        System.out.println(x);//11

        System.out.println(x++);//11--->12
        System.out.println(--x);//11
        System.out.println(--x);//10
        System.out.println(x--);//10
        System.out.println(++x);//10
    }
}
