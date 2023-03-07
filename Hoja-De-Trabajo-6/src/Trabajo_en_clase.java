
import java.util.Scanner;
import structure5.*;


public class Trabajo_en_clase {

    public static void main(String[] args) throws Exception {

        StackVector<String> newstack = new StackVector<String>();
        StackVector<String> newstackpab = new StackVector<String>();
        Scanner teclado = new Scanner(System.in);
        int elinteger;
        int contador;
        boolean decisio = true;
        String valor;
        boolean decisionpara = true;
        boolean decisionb = true;


        System.out.println("Por favor ingresar cuantas b quiere ingresar");
        elinteger = teclado.nextInt();
        contador = elinteger;
        for (int i = 0; i < elinteger; i++){
            if(elinteger > i ){
                newstack.push("b");
            }
        }

        //a{n} b{n} | n >= 1
        System.out.println("Por favor ingresar cuantas a quiere ingresar");
        elinteger = teclado.nextInt();
        for (int i = 0; i < elinteger; i++){
            if(elinteger > i ){
                newstack.push("a");
                newstackpab.push("a");
            }
        }


        while(decisio == true){
            
            while(decisionpara == true){
                valor = newstack.pop();
                if (valor =="a"){
                    decisionpara = true;
                    newstackpab.push("b");
                }
                else //if else
                    decisionpara = false;
                }
            

            while(decisionb == true){
                valor = newstackpab.pop();
                if (valor == "b" ){
                    decisionb = true;
                }
                else if(valor == "a" && contador == elinteger ){
                    decisionb = false;
                    System.out.println("Se Finalizo el proceso porque devuelve 1");
                    decisio =false;
                }
                else if(valor == "a" && contador != elinteger ){
                    decisionb = false;
                    System.out.println("Se Finalizo el proceso porque devuelve 0");
                    decisio =false;
                }

            }
            

            

            

            
            
        }
}







        





        //a(n)b(n) | n>= 1

        


}

