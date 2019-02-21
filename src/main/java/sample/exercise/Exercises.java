package sample.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exercises {

    /*
       Napisz metodę, która dla danej listy zwraca nową listę elementów, które są
       podzielne przez 3.
       List<Integer> getDividedByThree(List<Integer> numbers);
    */

    public List<Integer> getDividedByTree(List<Integer> numbers) {

        List<Integer> results = numbers
                .stream()
                .filter(n -> (n % 3) == 0)
                .collect(Collectors.toList());

        return results;
    }

    public List<Integer> getDividedByValue(List<Integer> numbers, int value) {

        return numbers
                .stream()
                .filter(n -> (n % value) == 0)
                .collect(Collectors.toList());
    }

   /* Napisz metodę, która dla danej listy zwraca nową posortowaną listę.
            List<Integer> getSortedList(List<Integer> numbers);
            */

    public List<Integer> getSortedList(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(i) < numbers.get(j) + 1) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
            System.out.println(numbers);
        }
        return numbers;
    }

    /*
    Napisz program, który odczytuje n liczb i wypisuje liczbę wystąpień danej liczby.
    Przykładowo dla danych:
            6
            1 2 4 4 4 3 3
       Wypisuje na ekran:
            1 występuje 1 raz
       2 występuje 1 raz
       3 występuje 2 razy
       4 występuje 3 razy
*/
    public void numberOfDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
           int  counter = 0;
            for (int j = 0; j < numbers.size(); j++) {

                if (numbers.get(i) == numbers.get(j)) {
                    counter++;
                }
            }
            results.put(numbers.get(i), counter);
        }

        for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    /*Napisz program, który symuluje działanie słownika polsko-angielskiego.
      Przykładowy program:
        Podaj słówko po Polsku:
         mama
         Słówko po Angielsku to mother.
        */

    public void dictionaryPolAng(Map<String, String> dictionary, String word) {
        System.out.println(dictionary.get(word));
    }

    /*Napisz program, który zamienia liczbę całkowitą na liczbę w systemie binarnym.
    Przykładowo dla danych:
            5
    Wynikiem powinno być:
            101*/

    public void toBinary(int number) {
        System.out.println(Integer.toBinaryString(number));
    }

    /*Napisz program, który tworzy przykładową ArrayListę zawierającą kolory. Wypisz
wszystkie utworzone kolory.
*/

    public List<String> randomColours(int size) {

        // create random object - reuse this as often as possible
        Random random = new Random();
        List<String> colours = new ArrayList<>();

        // create a big random number - maximum is ffffff (hex) = 16777215 (dez)
        for (int i = 0; i < size; i++) {

            int nextInt = random.nextInt(0xffffff + 1);
            String colourCode = String.format("#%06x", nextInt);

            colours.add(colourCode);
        }

        return colours;
    }

    /*Napisz implementacje następującej metody::
int findIndexOfColor(String color,List<String> colors)
Metoda powinna zwracać index na którym występuje dany kolor w liście bądź -1
jeśli taki kolor nie występuje w liście.*/

    public int whichColourIndex(List<String> colours, String colour) {

        for (int i = 0; i < colours.size(); i++) {
            if(colours.get(i).equals(colour)) {
                return i;
            }
        }
        return -1;
    }

    
}
