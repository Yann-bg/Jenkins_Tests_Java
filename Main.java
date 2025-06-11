class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Main <num1> <num2> <operator>");
            System.exit(-1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String op = args[2];

        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Erreur : division par zéro");
                    System.exit(-1);
                }
                System.out.println(a / b);
                break;
            default:
                System.out.println("Opérateur non reconnu");
                System.exit(-1);
        }
    }
}
