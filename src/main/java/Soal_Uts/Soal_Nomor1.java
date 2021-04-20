package Soal_Uts;
public class Soal_Nomor1 {
    public static void main(String[] args) {
        int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=0; i<data.length-1; i++){
            int indeksKecil = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j]<data[indeksKecil]){
                    indeksKecil = j;
                }
            }
            int temp = data[i];
            data[i] = data[indeksKecil];
            data[indeksKecil] = temp;
        }
        System.out.println("UTS");
        System.out.println("AGUNG BUDI(20090019)");
        System.out.println("=== Selection Sort ===");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
