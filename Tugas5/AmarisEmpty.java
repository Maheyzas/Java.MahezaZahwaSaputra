public class AmarisEmpty {
    public static void main(String[] args) {
       
        String roomHotel [][] ={
            {"*","*","*","X","*"},
            {"*","*","*","*","*"},
            {"*","*","*","*","*"},
            {"*","*","*","*","X"},
        };

        int emptyRoom = 0 ;

        for (int i = 0 ; i < roomHotel.length ;i++){
            for (int j = 0 ; j < roomHotel[i].length ; j++){
                if (roomHotel [i][j].equals("*"))                 
                    emptyRoom++;
                }
            }
            if (emptyRoom > 0){
            System.out.println("Jumlah kamar kosong " + emptyRoom + " kamar.");
            }else {
                System.out.println("Tidak ada kamar kosong ");
            }
    }
}
