
public class Amaris {
    public static void main(String[] args) {
        
        String roomHotel [][] ={
            {"X","*","*","X","*"},
            {"*","*","*","*","*"},
            {"*","*","*","*","X"},
        };

        int totalTamu = 0 ;

        for (int i = 0 ; i < roomHotel.length ;i++){
            for (int j = 0 ; j < roomHotel[i].length ; j++){
                if (roomHotel[i][j] == "X"){
                    if (roomHotel[i][j] == "X") {
                        int lantai = 4 - i;
                        int kamar = j + 1;
                        System.out.println("Tamu berada di lantai " + lantai + " kamar " + kamar);
                        totalTamu++;
                }
            }              
        }
                    if (totalTamu == 0) {
                        System.out.println("Tidak ada tamu.");
            }
        }
    }
}





