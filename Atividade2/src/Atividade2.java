public class Atividade2 {
 
        public static void main(String[] args){

            System.out.println("informe um numero ");
            Scanner teclado = new Scanner(System.in);
            
            int mostreumnumero;

            mostreumnumero = teclado. nextInt();
            teclado.close();

            System.out.println("o numero inforado foi:" + mostreumnumero );
        }
    }