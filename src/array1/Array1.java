package array1;
public class Array1 {

    public static void main(String[] args) {
        String tienda[] = {"helados", "gomas", "Chocolate", "arequipe"};
        String[] tienda2 = {"helados2", "gomas2", "Chocolate2", "arequipe2"};
        double precios[] = {12.5, 5.23, 14.8, 25.4};
        System.out.println("Lista de productos con precios: ");
        for (int i = 0; i < tienda.length; i++) {
            System.out.println(tienda[i] + " = " + precios[i]);
        }
        
        //otra manera d hacer for
        System.out.println("otro for");
        var j=0;
        for (var i : tienda2) {

            System.out.println(i + " == "+precios[j]);
            j++;

        }
        
        System.out.println(((Object)tienda).getClass().getSimpleName());
        System.out.println(((Object)tienda2).getClass().getSimpleName());
    }
}
