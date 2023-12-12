/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ahalalabirintusa;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


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
                + " Kiakarod nyitni a dobozt, vagy inkább tovább haladsz észak felé?";
    String oldal66="Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. "
                + "Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. "
                + "Nyugat felé kívánsz menni, vagy keletnek?";
    String oldal56= "Látod, hogy az akadály egy széles, barna, sziklaszerű tárgy. Megérinted, és meglepve tapasztalod, hogy lágy, szivacsszerű."
            + " Át szeretnél mászni rajta, vagy ketté akarod vágni a kardoddal?";
    String oldal137= "Ahogy végigmész az alagúton, csodálkozva látod, hogy egy jókora vasharang csüng alá a boltozatról.";
    String oldal215="Kardod könnyedén áthatol a spóragolyó vékonykülső burkán. Sűrű barna spórafelhő csap ki a golyóból, és körülvesz. Némelyik spóra a bőrödhöz tapad, és rettenetes viszketést okoz. Nagy daganatok nőnek az arcodon és karodon, és a bőröd mintha égne. "
            + "2 ÉLETERŐ pontot veszítesz. Vadul vakarózva átléped a leeresztett golyót, és keletnek veszed az utad.";
    String oldal270 ="A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” "
            + "Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mészészak felé.";
    String oldal293="A három pár nedves lábnyomot követve az alagútnyugati elágazásában hamarosan egy újabb el-ágazáshoz érsz. Továbbmész nyugat felé a lábnyomokat követve, vagy"
            + "inkább észak felé mész a harmadik pár lábnyom után?";
    String oldal373="Fölmászol a lágy sziklára, attól tartasz, hogy bár-melyik pillanatban elnyelhet. Nehéz átvergődni rajta, mert puha anyagában alig tudod a lábadat emelni, de végül átvergődsz rajta. Megkönnyebbülten érsz újra szilárd talajra, és fordulsz kelet felé.";
    String oldal387="Hallod, hogy elölről súlyos lépések közelednek. Egy széles, állatbőrökbe öltözött, kőbaltás, primitívlény lép elő. Ahogy meglát, morog, a földre köp, majd a kőbaltát felemelve közeledik, és mindennek kinéz, csak barátságosnak nem."
            + " Előhúzod kardodat, és felkészülsz, hogy megküzdj a Barlangi Emberrel.\n" +
"Barlangi Ember \nÜGYESSÉG: 7 \nÉLETERŐ: 7";
    ImageIcon varazslo = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\varazslo.png");
    ImageIcon torpe = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\harcos.png");
    ImageIcon tunde = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\tunde.png");
    ImageIcon varazsloNagy = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\nagyVarazslo.png");
    ImageIcon torpeNagy = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\harcos3.png");
    ImageIcon tundeNagy = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\nagyTunde.png");
    ImageIcon trofea = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\trofea.png");
    ImageIcon halal = new ImageIcon("C:\\Számalk\\Csolti\\A halál labirintusa\\src\\kepek\\halal.png");
    
    
    
    public HalalLabirintusa() {
        initComponents();
        btnVarazslo.setOpaque(false);
        btnVarazslo.setBackground(new Color(0, 0, 0, 0));
        btnTorpe.setOpaque(false);
        btnTorpe.setBackground(new Color(0, 0, 0, 0));
        btnTunde.setOpaque(false);
        btnTunde.setBackground(new Color(0, 0, 0, 0));

        pnlKezdes.setVisible(true);
        pnlKarakterValasztas.setVisible(false);
        lblKarakterHatter.setVisible(false);
        lblHatter.setVisible(false);
        pnlJatek.setVisible(false);
        btnTorpe.setVisible(false);
        btnTunde.setVisible(false);
        btnVarazslo.setVisible(false);
        lblKarakterCim.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJatek = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSzoveg = new javax.swing.JTextArea();
        lblKep = new javax.swing.JLabel();
        lblElet = new javax.swing.JLabel();
        lblEletMennyiseg = new javax.swing.JLabel();
        lblErme = new javax.swing.JLabel();
        lblErmeMennyiseg = new javax.swing.JLabel();
        lblCim = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        lblHatter = new javax.swing.JLabel();
        pnlKarakterValasztas = new javax.swing.JLayeredPane();
        lblKarakterCim = new javax.swing.JLabel();
        btnVarazslo = new javax.swing.JButton();
        btnTunde = new javax.swing.JButton();
        btnTorpe = new javax.swing.JButton();
        lblKepesseg = new javax.swing.JLabel();
        lblKarakterHatter = new javax.swing.JLabel();
        pnlKezdes = new javax.swing.JLayeredPane();
        lblElsoCim = new javax.swing.JLabel();
        btnKezdes = new javax.swing.JButton();
        lblHatterElso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halál Labirintus");
        setMaximumSize(new java.awt.Dimension(651, 453));
        setMinimumSize(new java.awt.Dimension(665, 488));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 453));
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(125, 66, 38));

        txtaSzoveg.setEditable(false);
        txtaSzoveg.setBackground(new java.awt.Color(107, 47, 18));
        txtaSzoveg.setColumns(20);
        txtaSzoveg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtaSzoveg.setForeground(new java.awt.Color(249, 241, 213));
        txtaSzoveg.setLineWrap(true);
        txtaSzoveg.setRows(5);
        txtaSzoveg.setText("Egy versenyre nevezel, aminek a lényege, hogy át kell kelni a halállabirintuson. A labirintusban tárgyakat találhatsz és szörnyekkel kell harcoljál.");
        txtaSzoveg.setWrapStyleWord(true);
        txtaSzoveg.setMargin(new java.awt.Insets(5, 10, 5, 10));
        jScrollPane1.setViewportView(txtaSzoveg);

        pnlJatek.add(jScrollPane1);
        jScrollPane1.setBounds(351, 32, 240, 280);

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/harcos3.png"))); // NOI18N
        pnlJatek.add(lblKep);
        lblKep.setBounds(80, 70, 185, 260);

        lblElet.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        lblElet.setText("Élet:");
        pnlJatek.add(lblElet);
        lblElet.setBounds(40, 360, 70, 30);

        lblEletMennyiseg.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        lblEletMennyiseg.setText("10");
        pnlJatek.add(lblEletMennyiseg);
        lblEletMennyiseg.setBounds(100, 360, 36, 30);

        lblErme.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        lblErme.setText("Érmék:");
        pnlJatek.add(lblErme);
        lblErme.setBounds(160, 360, 95, 30);

        lblErmeMennyiseg.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        lblErmeMennyiseg.setText("25");
        pnlJatek.add(lblErmeMennyiseg);
        lblErmeMennyiseg.setBounds(260, 360, 50, 30);

        lblCim.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblCim.setText("A HALÁL LABIRINTUSA");
        pnlJatek.add(lblCim);
        lblCim.setBounds(36, 26, 268, 33);

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 244, 225));
        btn1.setBorder(null);
        btn1.setContentAreaFilled(false);
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        pnlJatek.add(btn1);
        btn1.setBounds(350, 330, 140, 50);

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(249, 241, 213));
        btn2.setText("Tovább");
        btn2.setBorder(null);
        btn2.setContentAreaFilled(false);
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn2.setIconTextGap(1);
        btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        pnlJatek.add(btn2);
        btn2.setBounds(510, 330, 90, 50);

        getContentPane().add(pnlJatek);
        pnlJatek.setBounds(10, 10, 650, 450);

        lblHatter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/hatter4.png"))); // NOI18N
        getContentPane().add(lblHatter);
        lblHatter.setBounds(0, -10, 650, 470);
        getContentPane().add(pnlKarakterValasztas);
        pnlKarakterValasztas.setBounds(0, 0, 650, 0);

        lblKarakterCim.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lblKarakterCim.setText("VÁLASSZ KARAKTERT!");
        getContentPane().add(lblKarakterCim);
        lblKarakterCim.setBounds(130, 30, 410, 50);

        btnVarazslo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/varazslo.png"))); // NOI18N
        btnVarazslo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVarazsloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVarazsloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVarazsloMouseExited(evt);
            }
        });
        getContentPane().add(btnVarazslo);
        btnVarazslo.setBounds(60, 80, 180, 270);

        btnTunde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/tunde.png"))); // NOI18N
        btnTunde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTundeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTundeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTundeMouseExited(evt);
            }
        });
        getContentPane().add(btnTunde);
        btnTunde.setBounds(250, 90, 140, 260);

        btnTorpe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/harcos.png"))); // NOI18N
        btnTorpe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTorpeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTorpeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTorpeMouseExited(evt);
            }
        });
        getContentPane().add(btnTorpe);
        btnTorpe.setBounds(400, 90, 240, 260);

        lblKepesseg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblKepesseg.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(lblKepesseg);
        lblKepesseg.setBounds(100, 350, 460, 80);

        lblKarakterHatter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/hatter4.png"))); // NOI18N
        getContentPane().add(lblKarakterHatter);
        lblKarakterHatter.setBounds(0, 0, 650, 450);

        lblElsoCim.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        lblElsoCim.setForeground(new java.awt.Color(249, 241, 213));
        lblElsoCim.setText("<html>\n<head>\n <h1 text align=\"center\">A HALÁL<br>LABIRINTUSA</h1>\n</head>\n</html>");
        pnlKezdes.add(lblElsoCim);
        lblElsoCim.setBounds(89, 59, 227, 140);

        btnKezdes.setBackground(new java.awt.Color(102, 0, 0));
        btnKezdes.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnKezdes.setForeground(new java.awt.Color(249, 241, 213));
        btnKezdes.setText("<html>\n<head>\n <p>Induljon a kaland!</p>\n</head>\n</html>");
        btnKezdes.setContentAreaFilled(false);
        btnKezdes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKezdesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKezdesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKezdesMouseExited(evt);
            }
        });
        pnlKezdes.add(btnKezdes);
        btnKezdes.setBounds(82, 252, 199, 37);

        getContentPane().add(pnlKezdes);
        pnlKezdes.setBounds(10, 10, 630, 430);

        lblHatterElso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/csukott.png"))); // NOI18N
        getContentPane().add(lblHatterElso);
        lblHatterElso.setBounds(0, 0, 660, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnKezdesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKezdesMouseClicked
        lblKarakterHatter.setVisible(true);
        pnlKarakterValasztas.setVisible(true);
        btnTorpe.setVisible(true);
        btnTunde.setVisible(true);
        btnVarazslo.setVisible(true);
        lblKarakterCim.setVisible(true);
  
    }//GEN-LAST:event_btnKezdesMouseClicked

    private void btnVarazsloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVarazsloMouseEntered
    lblKepesseg.setText("<html>Varázsló<br />Élet: 8     Érmék: 20<br />Képesség:Varázsereje van, úgyhogy félnek tőle a trollok.</html>");
    btnVarazslo.setIcon(varazsloNagy);
    }//GEN-LAST:event_btnVarazsloMouseEntered

    private void btnTundeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTundeMouseEntered
    lblKepesseg.setText("<html>Tünde<br />Élet: 12     Érmék: 8<br />Képesség:Gyógyítóereje ven, ha sérül, +2 életerő</html>");
    btnTunde.setIcon(tundeNagy);
    }//GEN-LAST:event_btnTundeMouseEntered

    private void btnTorpeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTorpeMouseEntered
    lblKepesseg.setText("<html>Törpe<br />Élet: 10     Érmék: 10<br />Képesség:Hatalmas kalapácsa bárkit megsebez, csatában +2 sebzés.</html>");
    btnTorpe.setIcon(torpeNagy);
    }//GEN-LAST:event_btnTorpeMouseEntered

    private void btnVarazsloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVarazsloMouseClicked
    pnlJatek.setVisible(true);
    lblHatter.setVisible(true);
    lblKep.setIcon(varazsloNagy);
    lblEletMennyiseg.setText("8");
    lblErmeMennyiseg.setText("20");
    btn1.setVisible(true);
    btn2.setVisible(true);
    eletero=8;
    btnVarazslo.setEnabled(false);
    btnTunde.setEnabled(false);
    btnTorpe.setEnabled(false);
    }//GEN-LAST:event_btnVarazsloMouseClicked

    private void btnTundeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTundeMouseClicked

    pnlJatek.setVisible(true);
    lblHatter.setVisible(true);
    lblKep.setIcon(tundeNagy);
    lblEletMennyiseg.setText("12");
    lblErmeMennyiseg.setText("8");
    btn1.setVisible(true);
    btn2.setVisible(true);
    eletero=12;
    btnVarazslo.setEnabled(false);
    btnTunde.setEnabled(false);
    btnTorpe.setEnabled(false);
    }//GEN-LAST:event_btnTundeMouseClicked

    private void btnTorpeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTorpeMouseClicked
    pnlJatek.setVisible(true);
    lblHatter.setVisible(true);
    lblKep.setIcon(torpeNagy);
    lblEletMennyiseg.setText("10");
    lblErmeMennyiseg.setText("12");
    btn1.setVisible(true);
    btn2.setVisible(true);
    eletero=10;
    btnVarazslo.setEnabled(false);
    btnTunde.setEnabled(false);
    btnTorpe.setEnabled(false);
    }//GEN-LAST:event_btnTorpeMouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked

        szamlalo2+=1;
            if (szamlalo2 == 1) {
                txtaSzoveg.setText(oldal1);
                btn1.setText("<html>Kinyitom<br>a dobozt</html>");
                btn2.setText("<html>Tovább<br>  észak felé</html>");
            } else if (szamlalo2 == 2) {
                txtaSzoveg.setText(oldal66);
                btn1.setText("Nyugat felé");
                btn2.setText("Kelet felé");
            } else if (szamlalo2 == 3) {
                txtaSzoveg.setText(oldal56);
                btn1.setText("Átmászni");
                btn2.setText("Kettévágni");
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
                btn2.setText("HARC!");
                eletero -=7;
            } else if (szamlalo2 == 7) {
                harc();
            }
    }//GEN-LAST:event_btn2MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
            szamlalo1+=1;
            if (szamlalo1 == 1) {
                txtaSzoveg.setText(oldal1);
                btn1.setText("<html>Kinyitom<br>a dobozt</html>");
                btn2.setText("<html>Tovább<br>  észak felé</html>");
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
                btn1.setText("<html>Lábnyomokat<br>követem</html>");
                btn2.setText("");
            } else if (szamlalo1 == 5) {
                txtaSzoveg.setText(oldal137);
                btn1.setText("");
                btn2.setText("Tovább");
            } else if (szamlalo1 == 6) {
                txtaSzoveg.setText(oldal387);
                btn1.setText("");
                btn2.setText("HARC!");
                eletero -= 7;
            }
    }//GEN-LAST:event_btn1MouseClicked

    private void btnKezdesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKezdesMouseEntered
        btnKezdes.setForeground(Color.black);
    }//GEN-LAST:event_btnKezdesMouseEntered

    private void btnKezdesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKezdesMouseExited
        btnKezdes.setForeground(Color.getHSBColor(46,14, 97));

    }//GEN-LAST:event_btnKezdesMouseExited

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        btn1.setForeground(Color.black);
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        btn1.setForeground(Color.getHSBColor(46,14, 97));
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        btn2.setForeground(Color.getHSBColor(46,14, 97));
    }//GEN-LAST:event_btn2MouseExited

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        btn2.setForeground(Color.black);
    }//GEN-LAST:event_btn2MouseEntered

    private void btnTorpeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTorpeMouseExited
        btnTorpe.setIcon(torpe);
    }//GEN-LAST:event_btnTorpeMouseExited

    private void btnTundeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTundeMouseExited
        btnTunde.setIcon(tunde);
    }//GEN-LAST:event_btnTundeMouseExited

    private void btnVarazsloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVarazsloMouseExited
        btnVarazslo.setIcon(varazslo);
    }//GEN-LAST:event_btnVarazsloMouseExited

    private void harc() {
        if (eletero<=0 ){
            JOptionPane.showMessageDialog(rootPane, "A barlangi ember legyőzött, meghaltál!", "Harc!", HEIGHT, halal);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Legyőzted a barlangi embert!", "Harc!", HEIGHT, trofea);
        }
    }

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
    private javax.swing.JButton btnKezdes;
    private javax.swing.JButton btnTorpe;
    private javax.swing.JButton btnTunde;
    private javax.swing.JButton btnVarazslo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblElet;
    private javax.swing.JLabel lblEletMennyiseg;
    private javax.swing.JLabel lblElsoCim;
    private javax.swing.JLabel lblErme;
    private javax.swing.JLabel lblErmeMennyiseg;
    private javax.swing.JLabel lblHatter;
    private javax.swing.JLabel lblHatterElso;
    private javax.swing.JLabel lblKarakterCim;
    private javax.swing.JLabel lblKarakterHatter;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblKepesseg;
    private javax.swing.JLayeredPane pnlJatek;
    private javax.swing.JLayeredPane pnlKarakterValasztas;
    private javax.swing.JLayeredPane pnlKezdes;
    private javax.swing.JTextArea txtaSzoveg;
    // End of variables declaration//GEN-END:variables
}
