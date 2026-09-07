package CIET;

interface Calculator {
    int add(int a, int b);
}

class Filter_list_4 {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;

        int result = c.add(10, 20);
        System.out.println(result);

        System.out.println(c.add(29, 31));
    }
}