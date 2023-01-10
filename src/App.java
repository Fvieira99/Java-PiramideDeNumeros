public class App {
    public static void main(String[] args) {
        
        int qtdNumeros = 7;


        for(int i = 1; i <= qtdNumeros; i++){

            String s = "";

            for(int j = 0; j < i; j++){

                s += i;

            }

            System.out.println(s);

        }


    }
}
