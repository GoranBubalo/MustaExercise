public class Main {
    public static void main(String[] args) {

        /*
        Isprintaj brojebve uzastopno od 1 do 9 al nemoj da ima broj 7, i onda obrni redosljed
        brojeva naopako od 9 do 1
        * */

        for(int i = 1 ; i <= 9; i ++){
            if(i != 7) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        for (int i = 9; i >=1 ; i--){
            System.out.print(i + " ");
        }
    }
}