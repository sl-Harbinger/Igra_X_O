
import java.io.IOException;
import java.util.*;

class Igra {
    public static void main (String[] args) throws IOException {
        ArrayList<String> arra = new ArrayList<String>(); //массив
        PrintArray printArray = new PrintArray(); //класс печати массива
        Inp inp = new Inp();

        for (int i = 1; i < 10; i++) { // заполнение поля  массива"-"
            arra.add(String.valueOf(i));
        }
        printArray.getprintArray(arra);//печать поля
        inp.getInp(arra); //печать ходов

        }
    }






