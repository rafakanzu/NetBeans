package exception.handling;


public class tryCatchFinally{
    private static int i =0;
    public static void main(String args[]){
        while (true) {
            try{
                System.out.print("Pada saat i = " + i + ": ");
                if (i++ == 0){
                    throw new Exception(); // melempar eksepsi
                }
                System.out.println("Tidak terjadi eksepsi");
            } catch (Exception e){
                System.out.println("Terdapat eksepsi");
            } finally{
                System.out.println("Statemen dalam blok finally/n");
                if (i == 2 ) {
                    break; // pada saat i==2, perulangan akan berhenti
                }
            }
        }
    }
}
        
    