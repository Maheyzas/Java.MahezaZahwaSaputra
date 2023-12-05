package LearnJava;

public class Array {
    public static void main(String[] args) {
        
        String [] arrayStrings = new String [3];

        arrayStrings [0] = "Maheyza ";
        arrayStrings [1] = "Zahwa ";
        arrayStrings [2] = "Saputra ";

        System.out.print(arrayStrings [0]);
        System.out.print(arrayStrings [1]);
        System.out.print(arrayStrings [2]);


        String [] nama = {"Maheyza ", "Zawhwa ", "Saputra "};

        int [] arrayInt = new int []{
            10,20,30,40,50,60
        };

        System.out.println(nama.length);
        System.out.println(arrayInt.length);

        String [][] numbers = {
            {"ujang","jepret"},
            {"budi","anduk"},
            {"koko"}
        };

        System.out.println(numbers [0][1]);
        System.out.println(numbers [1][0]);
    }
}
