/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ahalalabirintusa;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * @author Lenovo
 */
public class HalalLabirintusa extends javax.swing.JFrame {
    int erem=25;
    int szamlalo1=1;
    int szamlalo2=0;
    int eletero=10;
    String oldal1= "Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, "
                + "amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették."
                + " Ha kiakarod nyitni a dobozt, lapozz a 270-re. Ha inkább tovább haladsz észak felé, lapozz a 66-ra.";
    String oldal66="Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. "
                + "Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. "
                + "Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.";
    String oldal56= "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű."
            + " Ha át szeretnél mászni rajta, lapozz a 373-ra."
            + " Ha ketté akarod vágni a kardoddal, lapozz a 215-re.";
    String oldal137= "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.";
    String oldal215="Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. "
            + "2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.";
    String oldal270 ="A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” "
            + "Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mészészak felé. Lapozz a 66-ra.";
    String oldal293="A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. Ha továbbmész nyugat felé a lábnyomokat követve, lapozz a 137-re."
            + " Ha inkább észak felé mész a harmadik pár lábnyom után, lapozz a 387-re.";
    String oldal373="Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.";
    String oldal387="Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem. Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.\n" +
"Barlangi Ember ÜGYESSÉG 7 ÉLETERŐ 7";
    
    public HalalLabirintusa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFoPanel = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSzoveg = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        lblKep = new javax.swing.JLabel();
        lblElet = new javax.swing.JLabel();
        lblEletMennyiseg = new javax.swing.JLabel();
        lblErme = new javax.swing.JLabel();
        lblErmeMennyiseg = new javax.swing.JLabel();
        lblCim = new javax.swing.JLabel();
        lblHatter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halál Labirintus");
        setMaximumSize(new java.awt.Dimension(651, 453));
        setMinimumSize(new java.awt.Dimension(665, 488));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 453));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtaSzoveg.setEditable(false);
        txtaSzoveg.setBackground(new java.awt.Color(91, 72, 41));
        txtaSzoveg.setColumns(20);
        txtaSzoveg.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtaSzoveg.setForeground(new java.awt.Color(239, 237, 193));
        txtaSzoveg.setLineWrap(true);
        txtaSzoveg.setRows(5);
        txtaSzoveg.setText("Egy versenyre nevezel, aminek a lényege, hogy át kell kelni a halállabirintuson. A labirintusban tárgyakat találhatsz és szörnyekkel kell harcoljál.");
        txtaSzoveg.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtaSzoveg);

        btn1.setBackground(new java.awt.Color(91, 72, 41));
        btn1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(239, 237, 193));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(91, 72, 41));
        btn2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(239, 237, 193));
        btn2.setText("Kezdés");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/harcos3.png"))); // NOI18N

        lblElet.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblElet.setText("Élet:");

        lblEletMennyiseg.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblEletMennyiseg.setText("10");

        lblErme.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblErme.setText("Érmék:");

        lblErmeMennyiseg.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblErmeMennyiseg.setText("25");

        lblCim.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblCim.setText("A HALÁL LABIRINTUSA");

        pnlFoPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(btn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(btn2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(lblKep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(lblElet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(lblEletMennyiseg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(lblErme, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(lblErmeMennyiseg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFoPanel.setLayer(lblCim, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlFoPanelLayout = new javax.swing.GroupLayout(pnlFoPanel);
        pnlFoPanel.setLayout(pnlFoPanelLayout);
        pnlFoPanelLayout.setHorizontalGroup(
            pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFoPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFoPanelLayout.createSequentialGroup()
                        .addGroup(pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlFoPanelLayout.createSequentialGroup()
                                .addComponent(lblElet, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEletMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lblErme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErmeMennyiseg))
                            .addGroup(pnlFoPanelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblKep, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(pnlFoPanelLayout.createSequentialGroup()
                        .addComponent(lblCim)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlFoPanelLayout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFoPanelLayout.setVerticalGroup(
            pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFoPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblCim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFoPanelLayout.createSequentialGroup()
                        .addComponent(lblKep)
                        .addGap(29, 29, 29)
                        .addGroup(pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblElet)
                            .addComponent(lblEletMennyiseg)
                            .addComponent(lblErme)
                            .addComponent(lblErmeMennyiseg))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(pnlFoPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        getContentPane().add(pnlFoPanel);
        pnlFoPanel.setBounds(10, 20, 650, 450);

        lblHatter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/hatter4.png"))); // NOI18N
        getContentPane().add(lblHatter);
        lblHatter.setBounds(0, -20, 690, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        szamlalo2+=1;
            if (szamlalo2 == 1) {
                txtaSzoveg.setText(oldal1);
                btn1.setText("Kinyitom a dobozt 270");
                btn2.setText("Tovább észak felé 66");
            } else if (szamlalo2 == 2) {
                txtaSzoveg.setText(oldal66);
                btn1.setText("Nyugat felé 293");
                btn2.setText("Kelet felé 56");
            } else if (szamlalo2 == 3) {
                txtaSzoveg.setText(oldal56);
                btn1.setText("Átmászni 373");
                btn2.setText("Kettévágni 215");
            } else if (szamlalo2 == 4) {
                txtaSzoveg.setText(oldal215);
                btn1.setText("");
                btn2.setText("Tovább");
                eletero -= 2;
                lblEletMennyiseg.setText(""+eletero);
            } else if (szamlalo2 == 5) {
                txtaSzoveg.setText(oldal137);
                btn1.setText("");
                btn2.setText("Tovább");
            } else if (szamlalo2 == 6) {
                txtaSzoveg.setText(oldal387);
                btn1.setText("");
                btn2.setText("");
            }
//            } else if (szamlalo2 == 7) {
//                txtaSzoveg.setText(oldal215);
//                btn1.setText("Átmászni 373");
//                btn2.setText("Kettévágni 215");
//                //szamlalo2 += 1;
//            } else if (szamlalo2 == 8) {
//                txtaSzoveg.setText(oldal215);
//                btn1.setText("Átmászni 373");
//                btn2.setText("Kettévágni 215");
//                //szamlalo2 += 1;
//            } else {
//                txtaSzoveg.setText(oldal215);
//                btn1.setText("Átmászni 373");
//                btn2.setText("Kettévágni 215");
//                //szamlalo2 += 1;
    }//GEN-LAST:event_btn2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    JTextArea txtaSzoveg = new JTextArea();
    txtaSzoveg.setOpaque(false);
    txtaSzoveg.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_formWindowOpened

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        szamlalo1+=1;
            if (szamlalo1 == 1) {
                txtaSzoveg.setText(oldal1);
                btn1.setText("Kinyitom a dobozt 270");
                btn2.setText("Tovább észak felé 66");
            } else if (szamlalo1 == 2) {
                txtaSzoveg.setText(oldal270);
                btn1.setText("Tovább");
                btn2.setText("");
                erem+=10;
                lblErmeMennyiseg.setText(""+erem);
            } else if (szamlalo1 == 3) {
                txtaSzoveg.setText(oldal66);
                btn1.setText("Nyugat felé");
                btn2.setText("Kelet felé");
            } else if (szamlalo1 == 4) {
                txtaSzoveg.setText(oldal293);
                btn1.setText("Lábnyomokat követem");
                btn2.setText("");
            } else if (szamlalo1 == 5) {
                txtaSzoveg.setText(oldal137);
                btn1.setText("");
                btn2.setText("Tovább");
            } else if (szamlalo1 == 6) {
                txtaSzoveg.setText(oldal387);
                btn1.setText("");
                btn2.setText("");
            }
    }//GEN-LAST:event_btn1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HalalLabirintusa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalalLabirintusa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalalLabirintusa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalalLabirintusa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalalLabirintusa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblElet;
    private javax.swing.JLabel lblEletMennyiseg;
    private javax.swing.JLabel lblErme;
    private javax.swing.JLabel lblErmeMennyiseg;
    private javax.swing.JLabel lblHatter;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLayeredPane pnlFoPanel;
    private javax.swing.JTextArea txtaSzoveg;
    // End of variables declaration//GEN-END:variables
}
