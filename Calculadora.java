public class Calculadora {
    static float resultado = 0;

    public Calculadora(float valor1, String typo, float valor2) {
        switch (typo) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
            default:
                System.err.println("Erro: typo nao definido: " + typo);
                break;
        }
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        new Calculadora(7, "*", 7);
    }
}