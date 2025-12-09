public class StringArr {
    private String[] arr;
    private int size;
    private int capacity;
    public StringArr(){
        capacity=10;
        arr=new String[capacity];
        size=0;
    }
    public StringArr(int c){
        capacity=c;
        arr=new String[capacity];
        size=0;
    }
    public StringArr(String a){
        capacity=10;
        arr=new String[capacity];
        size=0;
        add(a);
    }
    public void add(String a){
        if(a==null){
            throw new RuntimeException("НЕльзя добавить null элемент");

        }

        newcapacity();
        int index=0;
        while(index<size && arr[index].length()<a.length()){
            index++;
        }
        for (int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=a;
        size++;

    }
    public String maxarr(){
        if (size == 0) {
            throw new RuntimeException("Массив пустой!");
        }
        return arr[size - 1];
    }
    public double AverageLen(){
        if(size==0){
            return 0.0;
        }
        int t=0;
        for(int i=0;i<size;i++){
            t+=arr[i].length();
        }
        return t/size;
    }

    public int getSize() {
        return size;
    }

    public String getArr2() {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<size;i++){
            s.append(arr[i]);
            if(i<size-1){
                s.append(",");
            }
        }
        return s.toString();
    }

    public void newcapacity(){
        if(size==capacity){
            int newcap=capacity*2;
            String [] newarr=new String[newcap];
            for(int i=0;i<size;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;
            capacity=newcap;
        }
    }
}
