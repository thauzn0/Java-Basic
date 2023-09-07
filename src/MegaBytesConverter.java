public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{

            int megaBytes = kiloBytes / 1024;
            // 2 MB
            int remainKB = kiloBytes - (megaBytes * 1024);

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKB + " KB");

        }

    }
    public static  void main(String[] args){
        printMegaBytesAndKiloBytes(2500);

    }
}
