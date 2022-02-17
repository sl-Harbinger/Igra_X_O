import java.util.ArrayList;

class PrintArray {

    //печать листа как матрицы
    public void getprintArray(ArrayList<String> arrayList) {
        for (int i = 0; i < 9; i++) {
            if ((i == 2)||(i==5)) System.out.println(arrayList.get(i));
            else{
                System.out.print(arrayList.get(i));
                System.out.print(" ");
            }
        }System.out.println();
    }


}
