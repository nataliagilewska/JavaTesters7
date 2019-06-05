import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.lang.Comparable;

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

        //ZAD.3
        Map<Integer, String> mapka = new TreeMap<>();
        mapka.put(1, "1 zmapowany");
        mapka.put(2, "2 zmapowany");
        mapka.put(3, "3 zmapowany");
        System.out.println(mapka);

        //ZAD.4
        int i;
        String wpisane;
        Set<String> secik2 = new HashSet<String>();
        for (i=1;i<=5;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj ciag znakow");
            wpisane = scan.nextLine();
            if (secik2.equals(wpisane)==false)
            {
                secik2.add(wpisane);
            };
        }
        System.out.println(secik2);

        //ZAD. 5
        //5. Przygotuj prosty słownik dowolnego języka, zawierający kilka wpisów. Następnie w pętli pobieraj
        //od użytkownika kolejne słowa i wyświetlaj ich tłumaczenia. Jeśli podane słowo nie znajduje się w
        //słowniku należy wyświetlić stosowny komunikat.
        Map<String, String> mapka2 = new TreeMap<>();
        mapka2.put("drzewo", "tree");
        mapka2.put("motylek", "butterfly");
        mapka2.put("pies", "dog");
        System.out.println(mapka2);
        String wpisane2;
        for (int j=1;j<=5;j++)
        {
            Scanner scan2 = new Scanner(System.in);
            //String scan3=new String(scan2);
            System.out.println("Co chcesz przetlumaczyc?");
            wpisane2 = scan2.nextLine();
            if (mapka2.containsKey(wpisane2))
            {
                System.out.println(mapka2.get(wpisane2));
            }
            else {
                System.out.println("Nie ma takich danych w slowniku");
            }
        }





    }
}
