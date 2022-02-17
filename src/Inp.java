import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Inp {

    PrintArray printArray = new PrintArray();
    Logika logika = new Logika();

    public void getInp(ArrayList<String> arrayList) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {//сканер)

        for (int i = 1; i <10; i++) {
            if (i % 2 == 0) {
                System.out.println("Введите номер ячейки в кторой хотите поставить O");
                int play1 = sc.nextInt();
                //проверка занятости на О и Х
                if (((arrayList.get(play1-1))=="O") | ((arrayList.get(play1-1))=="X")){
                    System.out.println("Ячейка занята повторите ввод");
                    i--;
                    continue;
                }

                arrayList.set(play1 - 1, "O");
                printArray.getprintArray(arrayList);
            } else {
                System.out.println("Введите номер ячейки в кторой хотите поставить Х");
                int play2 = sc.nextInt();
                //проверка занятости на О и Х
                if (((arrayList.get(play2-1))=="O") | ((arrayList.get(play2-1))=="X")){
                    System.out.println("Ячейка занята повторите ввод");
                    i--;
                    continue;
                }

                arrayList.set(play2 - 1, "X");
                printArray.getprintArray(arrayList);
            }

            if ((i > 4) & (logika.getLogica(arrayList) == 1)) { //проверка логики после 5 хода
                System.out.println("Вы выиграли!");
                break;
            }
            if (i == 9) {
                System.out.println("Ничья");
                break;
            }
        }
        }
    }
}
