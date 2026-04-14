/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examplepackage;

import gr.aueb.cs.nlp.postagger.BigSetFunctions;
import gr.aueb.cs.nlp.postagger.SmallSetFunctions;
import gr.aueb.cs.nlp.postagger.WordWithCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//	//EXAMPLE 1    
//		List<WordWithCategory> list = null;
//
//             list = SmallSetFunctions.smallSetClassifyString("Αντικείμενο της συνάντησης ήταν η κατάσταση στη χώρα μας , όπως διαμορφώθηκε μετά την ψήφιση του Μεσοπρόθεσμου , οι αποφάσεις της Συνόδου Κορυφής της ΕΕ , αλλά και ο εναλλακτικός δρόμος που προτείνει η Αριστερά για έξοδο από την κρίση όλων των χωρών που αντιμετωπίζουν ανάλογα προβλήματα .");
//
//
//        OutputStream out = new FileOutputStream(new File("result.txt")) {
//
//            @Override
//            public void write(int b) throws IOException {
//                throw new UnsupportedOperationException("Not supported yet.");
//            }
//        };
//        PrintStream ps;
//        try {
//            ps = new PrintStream(out, true, "UTF-8");
//            for (int i=0;i<list.size();i++){
//            ps.println(list.get(i).toString());
//        }
//            ps.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		
//        //EXAMPLE 2
//
//        List<WordWithCategory> list = null;
//        list = SmallSetFunctions.smallSetClassifyFile("myfile.txt");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
//
//        //EXAMPLE 3
//
//        List<WordWithCategory> list = null;
//        list = BigSetFunctions.bigSetClassifyString(" Στρατιωτικές δυνάμεις πιστές στον συνταγματάρχη Καντάφι βομβαρδίζουν την πόλη Μιζουράτα της δυτικής Λιβύης , που τελεί υπό τον έλεγχο των αντικαθεστωτικών δυνάμεων , δήλωσε κάτοικος της πόλης στο πρακτορείο Reuters .  ");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
//
//        //EXAMPLE 4
//
//        List<WordWithCategory> list = null;
//        list = BigSetFunctions.bigSetClassifyFile("myfile.txt");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
//
//        //EXAMPLE 5
//
//        System.out.println(BigSetFunctions.bigSetEvaluateFile("test_high_7878.train"));
//
//        //EXAMPLE 6
//
//        System.out.println(SmallSetFunctions.smallSetEvaluateFile("test_low_7878.train"));
    }
}
