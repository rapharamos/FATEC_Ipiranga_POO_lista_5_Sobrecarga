public class TesteCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        
        System.out.println(calc.raiz(4)); 
        System.out.println(calc.raiz(4.0f)); 
        System.out.println(calc.raiz("4")); 
        System.out.println(calc.potencia(1, 0)); 
        System.out.println(calc.potencia("2", "2")); 
        System.out.println(calc.potencia(2, 2.0f));                
    }
}
