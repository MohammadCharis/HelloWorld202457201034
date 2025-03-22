package semester2;

public class Datatabel {
    public static void main(String[] args) {
        String [][] Data = {{"Abdul", "085646668991", "Kediri"},{"Kusno", "085646668992", "Trenggalek"},{"Poniran", "085646668999", "Bojonegoro"}};
        System.out.printf("%-10s %-12s %-12s%n", "NAMA", "ALAMAT", "TELEPON");
        System.out.println("................................................");
        
        for (int i = 0; i <Data.length; i++){
        System.out.printf("%-10s %-12s %-12s%n", Data[i][0], Data[i][2], Data[i][1]);
            
        }
    }
}

