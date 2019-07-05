import java.util.*;
import java.lang.Comparable;
import java.util.function.Predicate;

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

        //ZAD. 6
        //bedzie zrobione w projekcie JavaTesters6




        //ZAJECIA O WYRAZENIACH LAMBDA
        //poczytac o lambdach
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("runnable");
            }
        };  //tu musze dac srednik, bo stworzylam tu klase anonimowa

        Runnable runnable1 = new CustomRunnable();
        Runnable runnable2 = () -> System.out.println("dupa");
        runnable.run();
        runnable1.run();
        runnable2.run();
        Predicate<String> predicate = s -> s.length()>5; //import - alt +enter i wybieram import class
        //ctrl+Q otwiera javadoc

        List<String> strings = Arrays.asList("str1","str2","str3","dlugi string","dluzszy string");

        strings.forEach(s->System.out.println());


        strings.stream()
                .filter(predicate)
                .forEach(s->System.out.println(s));

        strings.replaceAll(x->x.toUpperCase());
        strings.forEach(System.out::println);
    }
}
