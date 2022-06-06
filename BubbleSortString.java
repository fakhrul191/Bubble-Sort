public class BubbleSortString {

    private String[] nama;

    public BubbleSortString(){
    }

    public String[] getNama() {
        return nama;
    }

    public void setNama(String[] nama){
        this.nama = nama;
    }

    public void sortNama(){
        for (int i=0;i<this.nama.length;i++){
            for (int j=i+1;j<this.nama.length;j++){
                if (this.nama[j].compareToIgnoreCase(this.nama[i])>0){
                    String temp = this.nama[i];
                    this.nama[i] = this.nama[j];
                    this.nama[j] = temp;
                }
            }
        }
    }

    public void PrintData(){
        for (String dataNama : this.nama){
            System.out.println(dataNama + " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"spiderman","superman","batman","wonderwomen","gundala"};
        BubbleSortString _myBubble = new BubbleSortString();
        _myBubble.setNama(nama);
        _myBubble.sortNama();
        _myBubble.PrintData();
    }

}
