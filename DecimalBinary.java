public class DecimalBinary {
    public static void toBinary(int decimal){
        int binary[] = new int[50];
        int index = 0;
        while(decimal>0){
            binary[index++]=decimal%2;
            decimal  = decimal/2;

        }
        for (int i = index-1; i>=0;i--){
            System.out.println(binary[i]);
        }
    }
    public static void main(String args[]){
        System.out.println("binary of 10 is");
        toBinary(10);
    }
}
