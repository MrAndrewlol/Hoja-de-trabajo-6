

import java.util.*;


/**
 * @author Andre Jo
 * 
 */
public class Mr_design_pattern<C,T>  {
    protected Map<C,Map<C, T>> categoria;
    protected Map<C,T> producto;


    public Mr_design_pattern() {
        categoria = null;
        producto = null;
        
    }

    public Mr_design_pattern(Map<C,Map<C,T>> categoria, Map<C,T> producto) {
        this.categoria = categoria;
        this.producto = producto;
    }


    public Map<C,Map<C, T>> Mrcatfactory(int opcion){
        switch(opcion){

            case 1:{//hashmap
                categoria = new HashMap<C, Map<C,T>>();
                break;
               
            }
            case 2:{ //treemap TreeMap<C, T>();
                categoria = new TreeMap<C, Map<C,T>>();
                break;
            }
            case 3:{ //Linked hashmapHashMap<C, T>();
                categoria = new LinkedHashMap<C, Map<C,T>>();
                break;
            }
        }
        return categoria;
    }

    public Map<C,T> Mrprofactory(int opcion){
        switch(opcion){

            case 1:{//hashmap
                producto = new HashMap<C, T>();
                break;

            }
            case 2:{ //treemap
                producto = new TreeMap<C, T>();
                break;
            }
            case 3:{ //Linked hashmap
                producto = new LinkedHashMap<C, T>();
                break;
            }
        }
        return producto;
    }    

    public void agregardatoscategoria(Map<C,Map<C, T>> category, ArrayList<C> lista, T cantidad, Map<C, T> product) {
        int i = 0;
        while(i < lista.size()) {
            agregardatosproducto(product, lista, i+1, cantidad);
            category.put(lista.get(i), producto);
            i = i + 2 ;
        }

    }

    public void agregardatosproducto(Map<C,T> producto, ArrayList<C> lista, int e, T cantidad){
        producto.put(lista.get(e), cantidad);
    }



    public Map<C,Map<C,T>> getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Map<C,Map<C,T>> categoria) {
        this.categoria = categoria;
    }

    public Map<C,T> getProducto() {
        return this.producto;
    }

    public void setProducto(Map<C,T> producto) {
        this.producto = producto;
    }

}