package APCSA;

public class ArrayList implements List {
    private int[] arr = new int[10];
    private int size = 0;

    //uses default variables
    public ArrayList() {}

    // used to reserve aray capacity up front
    public ArrayList(int capacity) {
        arr = new int[capacity];
    }

    private void resize(){
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void add(int n) {
        if(size == arr.length){
            resize();
        }
        arr[size++] = n;
    }
    
    public void add(int index, int n){
        if(size == arr.length){
            resize();
        }

        for(int i = size; i > index; i--){
            arr[i] = arr[i-1];
        }

        set(index,n);
        size++;
    }

    public void clear(){
        size = 0;
        arr = new int[10];
    }

    public boolean contains(int n){
        for(int i = 0; i < size; i ++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }

    public void set(int index, int n){
        arr[index] = n;
    }

    @Override
    public String toString(){
        if(size == 0) return "[]";
        String t = "[" + arr[0];
        for(int i = 1; i < size; i++){
            t += "," + arr[i];
        }
        return t + "]";
    }
}