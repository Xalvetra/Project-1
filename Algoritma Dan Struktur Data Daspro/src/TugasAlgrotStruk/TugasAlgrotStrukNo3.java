package TugasAlgrotStruk;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasAlgrotStrukNo3 {

    public static void main(String[] Args) {
        char kode[] = {'M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I'};
        int jumlah = 0, jumlah1 = 0,jumlah2 = 0,jumlah3 = 0;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == 'M') {
                jumlah++;
            } else if (kode[i] == 'I') {
                jumlah1++;
            } else if (kode[i] == 'S') {
                jumlah2++;
            }else
                jumlah3++;
        }
        for(int i =0;i<kode.length;i++){
            System.out.print(kode[i]+" ");
        }
        System.out.println("");
        System.out.println("Jumlah M : "+jumlah);
        System.out.println("Jumlah I : "+jumlah1);
        System.out.println("Jumlah S : "+jumlah2);
        System.out.println("Jumlah P : "+jumlah3);

    }
}
