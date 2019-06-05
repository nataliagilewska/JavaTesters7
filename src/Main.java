import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
        //Zad.1
        List<String> lista = new ArrayList<String>();
        lista.add("Element1");
        lista.add("Element2");
        lista.add("Element3");
        System.out.println(lista);
        //alt +insert - do dodawania geterow, seterow, equals, hashcode itd.

        //ZAD.2
        Set<Long> secik = new HashSet<Long>();
        secik.add(1L);
        secik.add(2L);
        secik.add(3L);
        System.out.println(secik);
    }
}
