package ua.com.hrv.max;


import java.util.Arrays;

public class MyArrayList<E> {
   private final int init_size = 10;
   private Object[] arr = new Object[init_size];
   private int point = 0;

    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }

    public void add(E item){
       if (point == arr.length-1)
           resize(arr.length*2);
       arr[point++] = item;
   }

   public void delete(int index){
       for (int i = index; i < point; i++) {
           arr[i] = arr[i+1];
           point--;
       }
   }

    private void resize(int nLength) {
       Object [] arrN = new Object[(int) nLength];
       System.arraycopy(arr,0,arrN,0,point);
       arr=arrN;
    }
}
