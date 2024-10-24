
 class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));       
        System.out.println(calculator.add(1.5, 2.5));    
        System.out.println(calculator.add(1, 2, 3));     
    }
}





