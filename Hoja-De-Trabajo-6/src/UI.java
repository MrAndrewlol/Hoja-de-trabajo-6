
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner; // Import the Scanner class to read text files

public class UI {
  public static void main(String[] args) {
    boolean saliropcion = true;
    String salir;
    int opcion;
    ArrayList<String> lista = new ArrayList<String>();
    String listatemporalp[];

    Mr_design_pattern<String, Integer> milista = new Mr_design_pattern<String, Integer>();
    
	  System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
	  Scanner in = new Scanner(System.in);
	  String fpath = in.nextLine();
   

	  
    try {
      while(saliropcion == true){ 
        System.out.println("\n\n1.Hashmap\n2.Treemap\n3.Linkedhashmap\n4.Salir");
        System.out.println("Que opción desea realizar? ");
        opcion = in.nextInt();
        Map<String,Map<String, Integer>> categoria= milista.Mrcatfactory(opcion);
        Map<String,Integer> producto = milista.Mrprofactory(opcion);



        switch(opcion){
          case 1:{
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              listatemporalp = data.split("\\|", 2);
              lista.add(listatemporalp[0].stripTrailing());
              lista.add(listatemporalp[1].trim());
              listatemporalp = null; 

              
              //termina el leedor de archivo
            }
            milista.agregardatoscategoria(categoria, lista,0, producto);

            for (String b:milista.getCategoria().keySet()){
               for (String z:milista.getProducto().keySet()) {
                System.out.println("Categoria: " + b + "producto: " + z +  +  milista.getProducto().get(z));
               }
              

            }
            myReader.close();
            break;
          }

          case 2:{

          }

          case 3:{
            

          }
          case 4: {
            saliropcion = false;

          }
        }

        
      }

    
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


