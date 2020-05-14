
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class scientific_cal extends javax.swing.JFrame {
double firstnum;
double secondnum;
double result;
String operation;
private Object math;
    public scientific_cal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jtxtdisplay1 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButtonbin1 = new javax.swing.JButton();
        jButtonround1 = new javax.swing.JButton();
        jButtonlog1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButtondecimal1 = new javax.swing.JButton();
        jButtontan1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButtonadd1 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButtonsub1 = new javax.swing.JButton();
        jButtonx4 = new javax.swing.JButton();
        jButtonback1 = new javax.swing.JButton();
        jButtontanh1 = new javax.swing.JButton();
        jButtonsin1 = new javax.swing.JButton();
        jButtoncosh1 = new javax.swing.JButton();
        jButtonhex1 = new javax.swing.JButton();
        jButtoncos1 = new javax.swing.JButton();
        jButtonclear1 = new javax.swing.JButton();
        jButtonpi1 = new javax.swing.JButton();
        jButtonsqrt1 = new javax.swing.JButton();
        jButtonsinh1 = new javax.swing.JButton();
        jButtonmul1 = new javax.swing.JButton();
        jButtonxy1 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButtonplusminus1 = new javax.swing.JButton();
        jButtonequal1 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButtonx5 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButtondiv1 = new javax.swing.JButton();
        jButtonlnx1 = new javax.swing.JButton();
        jButtonlog3 = new javax.swing.JButton();
        jButtonlogoctal1 = new javax.swing.JButton();
        jButtonlog5 = new javax.swing.JButton();
        jButtonmod1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jtxtdisplay = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButtonbin = new javax.swing.JButton();
        jButtonround = new javax.swing.JButton();
        jButtonlog = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtondecimal = new javax.swing.JButton();
        jButtontan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonsub = new javax.swing.JButton();
        jButtonx2 = new javax.swing.JButton();
        jButtonback = new javax.swing.JButton();
        jButtontanh = new javax.swing.JButton();
        jButtonsin = new javax.swing.JButton();
        jButtoncosh = new javax.swing.JButton();
        jButtonhex = new javax.swing.JButton();
        jButtoncos = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButtonpi = new javax.swing.JButton();
        jButtonsqrt = new javax.swing.JButton();
        jButtonsinh = new javax.swing.JButton();
        jButtonmul = new javax.swing.JButton();
        jButtonxy = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonplusminus = new javax.swing.JButton();
        jButtonequal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonx3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtondiv = new javax.swing.JButton();
        jButtonlnx = new javax.swing.JButton();
        jButtonlog2 = new javax.swing.JButton();
        jButtonlogoctal = new javax.swing.JButton();
        jButtonlog4 = new javax.swing.JButton();
        jButtonmod = new javax.swing.JButton();
        jcdistance = new javax.swing.JComboBox<>();
        convert = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jtxtenter1 = new javax.swing.JTextField();
        jtxtenter2 = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jlabelresult = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame1formWindowActivated(evt);
            }
        });

        jtxtdisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdisplay1ActionPerformed(evt);
            }
        });
        jtxtdisplay1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtdisplay1KeyTyped(evt);
            }
        });

        jButton14.setText("cbr");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButtonbin1.setText("bin");
        jButtonbin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbin1ActionPerformed(evt);
            }
        });

        jButtonround1.setText("round");
        jButtonround1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonround1ActionPerformed(evt);
            }
        });

        jButtonlog1.setText("log");
        jButtonlog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlog1ActionPerformed(evt);
            }
        });

        jButton10.setText("6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButtondecimal1.setText(".");
        jButtondecimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondecimal1ActionPerformed(evt);
            }
        });

        jButtontan1.setText("tan");
        jButtontan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontan1ActionPerformed(evt);
            }
        });

        jButton11.setText("4");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton15.setText("8");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("9");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButtonadd1.setText("+");
        jButtonadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd1ActionPerformed(evt);
            }
        });

        jButton17.setText("5");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButtonsub1.setText("-");
        jButtonsub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsub1ActionPerformed(evt);
            }
        });

        jButtonx4.setText("x^2");
        jButtonx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonx4ActionPerformed(evt);
            }
        });

        jButtonback1.setText("<--");
        jButtonback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonback1ActionPerformed(evt);
            }
        });

        jButtontanh1.setText("tanh");
        jButtontanh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontanh1ActionPerformed(evt);
            }
        });

        jButtonsin1.setText("sin");
        jButtonsin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsin1ActionPerformed(evt);
            }
        });

        jButtoncosh1.setText("cosh");
        jButtoncosh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncosh1ActionPerformed(evt);
            }
        });

        jButtonhex1.setText("hex");
        jButtonhex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhex1ActionPerformed(evt);
            }
        });

        jButtoncos1.setText("cos");
        jButtoncos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncos1ActionPerformed(evt);
            }
        });

        jButtonclear1.setText("C");
        jButtonclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclear1ActionPerformed(evt);
            }
        });

        jButtonpi1.setText("π ");
        jButtonpi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpi1ActionPerformed(evt);
            }
        });

        jButtonsqrt1.setText("√ ");
        jButtonsqrt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsqrt1ActionPerformed(evt);
            }
        });

        jButtonsinh1.setText("sinh");
        jButtonsinh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsinh1ActionPerformed(evt);
            }
        });

        jButtonmul1.setText("*");
        jButtonmul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmul1ActionPerformed(evt);
            }
        });

        jButtonxy1.setText("x^y");
        jButtonxy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonxy1ActionPerformed(evt);
            }
        });

        jButton18.setText("2");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("0");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButtonplusminus1.setText("±");
        jButtonplusminus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplusminus1ActionPerformed(evt);
            }
        });

        jButtonequal1.setText("=");
        jButtonequal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonequal1ActionPerformed(evt);
            }
        });

        jButton20.setText("1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButtonx5.setText("x^3");
        jButtonx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonx5ActionPerformed(evt);
            }
        });

        jButton21.setText("3");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButtondiv1.setText("/");
        jButtondiv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondiv1ActionPerformed(evt);
            }
        });

        jButtonlnx1.setText("lnx");
        jButtonlnx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlnx1ActionPerformed(evt);
            }
        });

        jButtonlog3.setText("log");
        jButtonlog3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlog3ActionPerformed(evt);
            }
        });

        jButtonlogoctal1.setText("octal");
        jButtonlogoctal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogoctal1ActionPerformed(evt);
            }
        });

        jButtonlog5.setText("log");
        jButtonlog5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlog5ActionPerformed(evt);
            }
        });

        jButtonmod1.setText("mod");
        jButtonmod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmod1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu3.setText("File");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Standard");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Scientific");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jtxtdisplay1)
                        .addGap(161, 161, 161)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonmul1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonsub1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtondiv1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(jButtonback1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonsqrt1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                                                .addComponent(jButtonlog1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonsin1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonsinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jButtonxy1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtontan1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtontanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                                                .addComponent(jButtonpi1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtoncos1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jButtoncosh1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonmod1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonlnx1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonlog3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jFrame1Layout.createSequentialGroup()
                                                .addComponent(jButtonx4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jFrame1Layout.createSequentialGroup()
                                                .addComponent(jButtonx5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonbin1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jFrame1Layout.createSequentialGroup()
                                                .addComponent(jButtonround1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonlog5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jFrame1Layout.createSequentialGroup()
                                                .addComponent(jButtonhex1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonlogoctal1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(6, 6, 6))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtondecimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonplusminus1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonequal1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtdisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonback1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonsqrt1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonlog1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonsin1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonsub1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonpi1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonround1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonlog5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonhex1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonlogoctal1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonmul1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonxy1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtontan1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtontanh1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonlog3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtondiv1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonx4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtondecimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonplusminus1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonequal1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonbin1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonx5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(204, 204, 204))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonsinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonmod1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtoncosh1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncos1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonlnx1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdisplayActionPerformed(evt);
            }
        });
        jtxtdisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtdisplayKeyTyped(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButtonbin.setText("bin");
        jButtonbin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbinActionPerformed(evt);
            }
        });

        jButtonround.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButtonround.setText("rond");
        jButtonround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonroundActionPerformed(evt);
            }
        });

        jButtonlog.setText("log");
        jButtonlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtondecimal.setText(".");
        jButtondecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondecimalActionPerformed(evt);
            }
        });

        jButtontan.setText("tan");
        jButtontan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontanActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonadd.setText("+");
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonsub.setText("-");
        jButtonsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubActionPerformed(evt);
            }
        });

        jButtonx2.setText("x^2");
        jButtonx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonx2ActionPerformed(evt);
            }
        });

        jButtonback.setText("<--");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        jButtontanh.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButtontanh.setText("tanh");
        jButtontanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontanhActionPerformed(evt);
            }
        });

        jButtonsin.setText("sin");
        jButtonsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsinActionPerformed(evt);
            }
        });

        jButtoncosh.setFont(new java.awt.Font("Ebrima", 1, 8)); // NOI18N
        jButtoncosh.setText("cosh");
        jButtoncosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncoshActionPerformed(evt);
            }
        });

        jButtonhex.setText("hex");
        jButtonhex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhexActionPerformed(evt);
            }
        });

        jButtoncos.setText("cos");
        jButtoncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncosActionPerformed(evt);
            }
        });

        jButtonclear.setText("C");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        jButtonpi.setText("π ");
        jButtonpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpiActionPerformed(evt);
            }
        });

        jButtonsqrt.setText("√ ");
        jButtonsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsqrtActionPerformed(evt);
            }
        });

        jButtonsinh.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButtonsinh.setText("sinh");
        jButtonsinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsinhActionPerformed(evt);
            }
        });

        jButtonmul.setText("*");
        jButtonmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmulActionPerformed(evt);
            }
        });

        jButtonxy.setText("x^y");
        jButtonxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonxyActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonplusminus.setText("±");
        jButtonplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplusminusActionPerformed(evt);
            }
        });

        jButtonequal.setText("=");
        jButtonequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonequalActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonx3.setText("x^3");
        jButtonx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonx3ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtondiv.setText("/");
        jButtondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivActionPerformed(evt);
            }
        });

        jButtonlnx.setText("lnx");
        jButtonlnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlnxActionPerformed(evt);
            }
        });

        jButtonlog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlog2ActionPerformed(evt);
            }
        });

        jButtonlogoctal.setText("oct");
        jButtonlogoctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogoctalActionPerformed(evt);
            }
        });

        jButtonlog4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlog4ActionPerformed(evt);
            }
        });

        jButtonmod.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButtonmod.setText("mod");
        jButtonmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodActionPerformed(evt);
            }
        });

        jcdistance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcdistance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Distance", "Speed", "Time" }));
        jcdistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcdistanceActionPerformed(evt);
            }
        });

        convert.setText("convert");
        convert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        jButtonreset.setText("reset");
        jButtonreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });

        jtxtenter1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtxtenter2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlabelresult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Unit converter");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtdisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonsub, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtondecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonequal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonlog, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonsin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonx2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonlogoctal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonround, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonpi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonxy, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonx3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonbin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtontan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtontanh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonhex, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonlnx, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jtxtenter2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonmod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcdistance, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtenter1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonlog2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonlog4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlabelresult, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButtonreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 397, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jtxtdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonsub, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonpi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonlnx, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonxy, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtontan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtontanh, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonx2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonround, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonlogoctal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtondecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonequal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonx3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonbin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonhex, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonlog, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonsin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonmod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcdistance, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtenter1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtenter2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addComponent(jlabelresult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jButtonlog4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButtonlog2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(201, 201, 201))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
this.setResizable(true);   
this.setSize(300, 420);        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
this.setResizable(true);   
this.setSize(620, 420);   
jtxtdisplay.setSize(470,39);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jtxtdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdisplayActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
this.setResizable(true);   
this.setSize(300, 420);
    }//GEN-LAST:event_formWindowActivated

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String inum=jtxtdisplay.getText() + jButton7.getText();
        jtxtdisplay.setText(inum);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
String bks=null;
if(jtxtdisplay.getText().length()>0){
    StringBuilder str=new StringBuilder(jtxtdisplay.getText());
    str.deleteCharAt(jtxtdisplay.getText().length()-1);
    bks=str.toString();
    jtxtdisplay.setText(bks);
}
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtoncoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncoshActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.cosh(ops);
jtxtdisplay.setText(String.valueOf(ops));        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoncoshActionPerformed

    private void jButtonhexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonhexActionPerformed
int a=Integer.parseInt(jtxtdisplay.getText());
jtxtdisplay.setText(Integer.toString(a,16));
    }//GEN-LAST:event_jButtonhexActionPerformed

    private void jButtonxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonxyActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.pow(ops,ops);
jtxtdisplay.setText(String.valueOf(ops));   
    }//GEN-LAST:event_jButtonxyActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButtonsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubActionPerformed
firstnum=Double.parseDouble(jtxtdisplay.getText());
jtxtdisplay.setText(null);
operation=("-");
    }//GEN-LAST:event_jButtonsubActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          String inum=jtxtdisplay.getText() + jButton8.getText();
        jtxtdisplay.setText(inum);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   String inum=jtxtdisplay.getText() + jButton4.getText();
        jtxtdisplay.setText(inum);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   String inum=jtxtdisplay.getText() + jButton5.getText();
        jtxtdisplay.setText(inum);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   String inum=jtxtdisplay.getText() + jButton6.getText();
        jtxtdisplay.setText(inum);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String inum=jtxtdisplay.getText() + jButton1.getText();
        jtxtdisplay.setText(inum);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   String inum=jtxtdisplay.getText() + jButton2.getText();
        jtxtdisplay.setText(inum);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String inum=jtxtdisplay.getText() + jButton3.getText();
        jtxtdisplay.setText(inum);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
   String inum=jtxtdisplay.getText() + jButton0.getText();
        jtxtdisplay.setText(inum);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
         jtxtdisplay.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     String inum=jtxtdisplay.getText() + jButton9.getText();
        jtxtdisplay.setText(inum);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtondecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondecimalActionPerformed
if(!jtxtdisplay.getText().contains("."))
{
    jtxtdisplay.setText(jtxtdisplay.getText()+jButtondecimal.getText());
}
    }//GEN-LAST:event_jButtondecimalActionPerformed

    private void jButtonplusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplusminusActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=ops*(-1);
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonplusminusActionPerformed

    private void jButtonsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsqrtActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.sqrt(ops);
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonsqrtActionPerformed

    private void jButtonlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.log(ops);
jtxtdisplay.setText(String.valueOf(ops));    
    }//GEN-LAST:event_jButtonlogActionPerformed

    private void jButtonsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsinActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.sin(ops);
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonsinActionPerformed

    private void jButtonsinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsinhActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.sinh(ops);
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonsinhActionPerformed

    private void jButtoncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncosActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.cos(ops);
jtxtdisplay.setText(String.valueOf(ops));        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoncosActionPerformed

    private void jButtontanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontanActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.tan(ops);
jtxtdisplay.setText(String.valueOf(ops));        // TODO add your handling code here:
    }//GEN-LAST:event_jButtontanActionPerformed

    private void jButtontanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontanhActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.tanh(ops);
jtxtdisplay.setText(String.valueOf(ops));        // TODO add your handling code here:
    }//GEN-LAST:event_jButtontanhActionPerformed

    private void jButtonpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpiActionPerformed
double ops;
ops=(3.14159);
jtxtdisplay.setText(String.valueOf(ops));     
    }//GEN-LAST:event_jButtonpiActionPerformed

    private void jButtonroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonroundActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.round(ops);
jtxtdisplay.setText(String.valueOf(ops));   
    }//GEN-LAST:event_jButtonroundActionPerformed

    private void jButtonx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonx2ActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=ops*ops;
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonx2ActionPerformed

    private void jButtonx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonx3ActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=ops*ops*ops;
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonx3ActionPerformed

    private void jButtonbinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbinActionPerformed
int a=Integer.parseInt(jtxtdisplay.getText());
jtxtdisplay.setText(Integer.toString(a,2));
    }//GEN-LAST:event_jButtonbinActionPerformed

    private void jtxtdisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdisplayKeyTyped
char c =evt.getKeyChar();
if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)))
{
    getToolkit().beep();
    evt.consume();
}
    }//GEN-LAST:event_jtxtdisplayKeyTyped

    private void jButtonmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmulActionPerformed
firstnum=Double.parseDouble(jtxtdisplay.getText());
jtxtdisplay.setText(null);
operation=("*");
    }//GEN-LAST:event_jButtonmulActionPerformed

    private void jButtonequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonequalActionPerformed
String answer;
secondnum=Double.parseDouble(jtxtdisplay.getText());
if(operation=="+"){
    result=firstnum+secondnum;
    answer=String.format("%.2f",result);
    jtxtdisplay.setText(answer);
}
else if(operation=="-"){
    result=firstnum-secondnum;
        answer=String.format("%.2f",result);
jtxtdisplay.setText(answer);
}
else if(operation=="*"){
    result=firstnum*secondnum;
        answer=String.format("%.2f",result);
jtxtdisplay.setText(answer);
}
else if(operation=="/"){
    result=firstnum/secondnum;
        answer=String.format("%.2f",result);
jtxtdisplay.setText(answer);
}
else if(operation=="%"){
    result=firstnum%secondnum;
        answer=String.format("%.2f",result);
jtxtdisplay.setText(answer);
}
    }//GEN-LAST:event_jButtonequalActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
firstnum=Double.parseDouble(jtxtdisplay.getText());
jtxtdisplay.setText(null);
operation=("+");
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivActionPerformed
firstnum=Double.parseDouble(jtxtdisplay.getText());
jtxtdisplay.setText(null);
operation=("/");
    }//GEN-LAST:event_jButtondivActionPerformed

    private void jButtonlnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlnxActionPerformed
double ops=Double.parseDouble(String.valueOf(jtxtdisplay.getText())) ;
ops=Math.log10(ops);
jtxtdisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonlnxActionPerformed

    private void jButtonlog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlog2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlog2ActionPerformed

    private void jButtonlogoctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogoctalActionPerformed
      int a=Integer.parseInt(jtxtdisplay.getText());
jtxtdisplay.setText(Integer.toString(a,8));
    }//GEN-LAST:event_jButtonlogoctalActionPerformed

    private void jButtonlog4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlog4ActionPerformed

    }//GEN-LAST:event_jButtonlog4ActionPerformed

    private void jButtonmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodActionPerformed
firstnum=Double.parseDouble(jtxtdisplay.getText());
jtxtdisplay.setText(null);
operation=("%");
    }//GEN-LAST:event_jButtonmodActionPerformed

    private void jtxtdisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdisplay1ActionPerformed

    private void jtxtdisplay1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdisplay1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdisplay1KeyTyped

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButtonbin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonbin1ActionPerformed

    private void jButtonround1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonround1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonround1ActionPerformed

    private void jButtonlog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlog1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlog1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButtondecimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondecimal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtondecimal1ActionPerformed

    private void jButtontan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtontan1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButtonadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonadd1ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButtonsub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsub1ActionPerformed

    private void jButtonx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonx4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonx4ActionPerformed

    private void jButtonback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonback1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonback1ActionPerformed

    private void jButtontanh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontanh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtontanh1ActionPerformed

    private void jButtonsin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsin1ActionPerformed

    private void jButtoncosh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncosh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoncosh1ActionPerformed

    private void jButtonhex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonhex1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonhex1ActionPerformed

    private void jButtoncos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoncos1ActionPerformed

    private void jButtonclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonclear1ActionPerformed

    private void jButtonpi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonpi1ActionPerformed

    private void jButtonsqrt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsqrt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsqrt1ActionPerformed

    private void jButtonsinh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsinh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsinh1ActionPerformed

    private void jButtonmul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmul1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonmul1ActionPerformed

    private void jButtonxy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonxy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonxy1ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButtonplusminus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplusminus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonplusminus1ActionPerformed

    private void jButtonequal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonequal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonequal1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButtonx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonx5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonx5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButtondiv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondiv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtondiv1ActionPerformed

    private void jButtonlnx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlnx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlnx1ActionPerformed

    private void jButtonlog3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlog3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlog3ActionPerformed

    private void jButtonlogoctal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogoctal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlogoctal1ActionPerformed

    private void jButtonlog5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlog5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlog5ActionPerformed

    private void jButtonmod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonmod1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jFrame1formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame1formWindowActivated

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
this.setResizable(true);
this.setSize(970,410);
jtxtdisplay.setSize(484,39);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
if((jtxtenter1.getText().equals(""))||(jtxtenter2.getText().equals("")))
{
    JOptionPane.showMessageDialog(null, "you must enter a value to compute","dst system",JOptionPane.INFORMATION_MESSAGE);
}
else if(jcdistance.getSelectedItem().equals("Distance"))
{
    double dst1=Double.parseDouble(jtxtenter1.getText());
    double dst2=Double.parseDouble(jtxtenter2.getText());
    double dst3;
    jlabel1.setText("distance =");
    jlabel2.setText("speed X");
    jlabel3.setText("time");
    dst3=dst1*dst2;
    String value=String.format("%.2f",dst3);
    jlabelresult.setText(value);
}
    }//GEN-LAST:event_convertActionPerformed

    private void jcdistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcdistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcdistanceActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
jlabelresult.setText(null);
jtxtenter1.setText(null);
jtxtenter2.setText(null);
jlabel1.setText(null);
jlabel2.setText(null);
jlabel3.setText(null);
jcdistance.getSelectedItem().equals("Select an Option");
    }//GEN-LAST:event_jButtonresetActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scientific_cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonadd1;
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtonback1;
    private javax.swing.JButton jButtonbin;
    private javax.swing.JButton jButtonbin1;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonclear1;
    private javax.swing.JButton jButtoncos;
    private javax.swing.JButton jButtoncos1;
    private javax.swing.JButton jButtoncosh;
    private javax.swing.JButton jButtoncosh1;
    private javax.swing.JButton jButtondecimal;
    private javax.swing.JButton jButtondecimal1;
    private javax.swing.JButton jButtondiv;
    private javax.swing.JButton jButtondiv1;
    private javax.swing.JButton jButtonequal;
    private javax.swing.JButton jButtonequal1;
    private javax.swing.JButton jButtonhex;
    private javax.swing.JButton jButtonhex1;
    private javax.swing.JButton jButtonlnx;
    private javax.swing.JButton jButtonlnx1;
    private javax.swing.JButton jButtonlog;
    private javax.swing.JButton jButtonlog1;
    private javax.swing.JButton jButtonlog2;
    private javax.swing.JButton jButtonlog3;
    private javax.swing.JButton jButtonlog4;
    private javax.swing.JButton jButtonlog5;
    private javax.swing.JButton jButtonlogoctal;
    private javax.swing.JButton jButtonlogoctal1;
    private javax.swing.JButton jButtonmod;
    private javax.swing.JButton jButtonmod1;
    private javax.swing.JButton jButtonmul;
    private javax.swing.JButton jButtonmul1;
    private javax.swing.JButton jButtonpi;
    private javax.swing.JButton jButtonpi1;
    private javax.swing.JButton jButtonplusminus;
    private javax.swing.JButton jButtonplusminus1;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JButton jButtonround;
    private javax.swing.JButton jButtonround1;
    private javax.swing.JButton jButtonsin;
    private javax.swing.JButton jButtonsin1;
    private javax.swing.JButton jButtonsinh;
    private javax.swing.JButton jButtonsinh1;
    private javax.swing.JButton jButtonsqrt;
    private javax.swing.JButton jButtonsqrt1;
    private javax.swing.JButton jButtonsub;
    private javax.swing.JButton jButtonsub1;
    private javax.swing.JButton jButtontan;
    private javax.swing.JButton jButtontan1;
    private javax.swing.JButton jButtontanh;
    private javax.swing.JButton jButtontanh1;
    private javax.swing.JButton jButtonx2;
    private javax.swing.JButton jButtonx3;
    private javax.swing.JButton jButtonx4;
    private javax.swing.JButton jButtonx5;
    private javax.swing.JButton jButtonxy;
    private javax.swing.JButton jButtonxy1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JComboBox<String> jcdistance;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabelresult;
    private javax.swing.JTextField jtxtdisplay;
    private javax.swing.JTextField jtxtdisplay1;
    private javax.swing.JTextField jtxtenter1;
    private javax.swing.JTextField jtxtenter2;
    // End of variables declaration//GEN-END:variables
}
