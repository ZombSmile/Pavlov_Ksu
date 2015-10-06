import java.util.Arrays;

public class sorting {

  public static void main(String[] args) {
    double startTime, timeDifferece;
    int size = 10;
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = (int) Math.round(Math.random() * 100 );
    }
    sorting( array , size );
    for (int i = 0; i < size ; i++) {
      System.out.println(array[i]);
    }
  }
  public static void sorting(int[] array, int size) {
    int size1 = size;
    int t;
    boolean swap = true;
    while (size1 > 1 || swap) {
        if (size1 > 1) 
            size1 = (int) (size1 / 1.24);
        int i = 0;
        swap = false;
        while (i + size1 < size) {
            if (array[i] > array[i + size1]) {
                t = array[i];
                array[i] = array[i + size1];
                array[i + size1] = t;
                swap = true;
            }
            i++;
        }
    }
  }
}