import java.util.ArrayList;

public class Logika {

    int getLogica(ArrayList<String> arrayList) {

        if (((arrayList.get(0) == arrayList.get(1)) & (arrayList.get(1) == arrayList.get(2))) | //первая стока
            ((arrayList.get(3) == arrayList.get(4)) & (arrayList.get(3) == arrayList.get(5))) | //вторая строка
            ((arrayList.get(6) == arrayList.get(7)) & (arrayList.get(6) == arrayList.get(8))) | //третья строка

            ((arrayList.get(0) == arrayList.get(3)) & (arrayList.get(0) == arrayList.get(6))) | //первый столбец
            ((arrayList.get(1) == arrayList.get(4)) & (arrayList.get(1) == arrayList.get(7))) | //второй столбец
            ((arrayList.get(2) == arrayList.get(5)) & (arrayList.get(2) == arrayList.get(8))) | //третий столбец

            ((arrayList.get(0) == arrayList.get(4)) & (arrayList.get(4) == arrayList.get(8))) | //диагональ\
            ((arrayList.get(2) == arrayList.get(4)) & (arrayList.get(4) == arrayList.get(6)))) //диагональ/
        {
            return 1;
        }
        else{
            return 0;
        }

    }

}
