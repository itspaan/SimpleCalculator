import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Kalkulator sederhana menggunakan GUI dengan Swing untuk mendemonstrasikan operasi matematika dasar.
 * Aplikasi ini mencakup operasi penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class Calculator extends JFrame implements ActionListener {
    /**
     * Variabel untuk menyimpan angka pertama yang digunakan dalam perhitungan.
     */
    private double a;

    /**
     * Variabel untuk menyimpan angka kedua yang digunakan dalam perhitungan.
     */
    private double b;

    /**
     * Variabel untuk menyimpan hasil dari operasi perhitungan.
     */
    private double result;

    /**
     * Variabel untuk menyimpan operator yang dipilih (1 = tambah, 2 = kurang, 3 = kali, 4 = bagi).
     */
    private int operator;

    /**
     * Tombol-tombol kalkulator.
     */
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bpro, bdiv, beq, bdec, bc;

    /**
     * Tampilan teks untuk menampilkan angka dan hasil perhitungan.
     */
    private JTextField tf;

    // Konstruktor dan metode lainnya tetap sama


    /**
     * Konstruktor untuk inisialisasi komponen GUI kalkulator dan pengaturan tampilan.
     * Mengatur tampilan tombol, font, dan ukuran komponen, serta menambahkan event listener.
     */
    public Calculator() {
        // Mengatur pengaturan jendela kalkulator
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setSize(430, 570);
        setLayout(null);
        setVisible(true);

        // Membuat tombol-tombol kalkulator
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        badd = new JButton("+");
        bsub = new JButton("-");
        bpro = new JButton("x");
        bdiv = new JButton("/");
        bdec = new JButton(".");
        beq = new JButton("=");
        bc = new JButton("CLEAR");
        tf = new JTextField();

        // Mengatur font untuk komponen
        tf.setFont(new Font("Arial", Font.BOLD, 30));
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        badd.setFont(new Font("Arial", Font.BOLD, 20));
        bsub.setFont(new Font("Arial", Font.BOLD, 20));
        bdiv.setFont(new Font("Arial", Font.BOLD, 20));
        bpro.setFont(new Font("Arial", Font.BOLD, 20));
        bdec.setFont(new Font("Arial", Font.BOLD, 20));
        beq.setFont(new Font("Arial", Font.BOLD, 30));
        bc.setFont(new Font("Arial", Font.BOLD, 20));

        // Menentukan posisi tombol di jendela
        b1.setBounds(0, 250, 100, 50);
        b2.setBounds(100, 250, 100, 50);
        b3.setBounds(200, 250, 100, 50);
        b4.setBounds(0, 300, 100, 50);
        b5.setBounds(100, 300, 100, 50);
        b6.setBounds(200, 300, 100, 50);
        b7.setBounds(0, 350, 100, 50);
        b8.setBounds(100, 350, 100, 50);
        b9.setBounds(200, 350, 100, 50);
        b0.setBounds(0, 400, 100, 50);
        badd.setBounds(100, 400, 100, 50);
        bsub.setBounds(200, 400, 100, 50);
        bdiv.setBounds(0, 450, 100, 50);
        bpro.setBounds(100, 450, 100, 50);
        bdec.setBounds(200, 450, 100, 50);
        beq.setBounds(300, 250, 100, 250);  // Tombol "=" lebih besar
        bc.setBounds(300, 200, 100, 50);  // Tombol CLEAR

        tf.setBounds(0, 0, 400, 200);  // Menyesuaikan ukuran field

        // Menambahkan tombol dan area teks ke jendela
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(badd);
        add(bsub);
        add(bpro);
        add(bdiv);
        add(beq);
        add(bdec);
        add(tf);
        add(bc);

        // Menambahkan ActionListener untuk setiap tombol
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bpro.addActionListener(this);
        bdiv.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bc.addActionListener(this);
        tf.addActionListener(this);
    }

    /**
     * Menangani peristiwa saat tombol ditekan.
     * 
     * @param e Objek ActionEvent yang mewakili peristiwa tombol yang ditekan.
     */
    public void actionPerformed(ActionEvent e) {
        // Menambahkan angka atau simbol yang sesuai ke tampilan
        if (e.getSource() == b1) {
            tf.setText(tf.getText().concat("1"));
        } else if (e.getSource() == b2) {
            tf.setText(tf.getText().concat("2"));
        } else if (e.getSource() == b3) {
            tf.setText(tf.getText().concat("3"));
        } else if (e.getSource() == b4) {
            tf.setText(tf.getText().concat("4"));
        } else if (e.getSource() == b5) {
            tf.setText(tf.getText().concat("5"));
        } else if (e.getSource() == b6) {
            tf.setText(tf.getText().concat("6"));
        } else if (e.getSource() == b7) {
            tf.setText(tf.getText().concat("7"));
        } else if (e.getSource() == b8) {
            tf.setText(tf.getText().concat("8"));
        } else if (e.getSource() == b9) {
            tf.setText(tf.getText().concat("9"));
        } else if (e.getSource() == b0) {
            tf.setText(tf.getText().concat("0"));
        } else if (e.getSource() == bdec) {
            tf.setText(tf.getText().concat("."));
        }

        // Menangani operator
        if (e.getSource() == badd) {
            a = Double.parseDouble(tf.getText());
            operator = 1;
            tf.setText("");
        } else if (e.getSource() == bsub) {
            a = Double.parseDouble(tf.getText());
            operator = 2;
            tf.setText("");
        } else if (e.getSource() == bpro) {
            a = Double.parseDouble(tf.getText());
            operator = 3;
            tf.setText("");
        } else if (e.getSource() == bdiv) {
            a = Double.parseDouble(tf.getText());
            operator = 4;
            tf.setText("");
        }

        // Menangani perhitungan hasil
        if (e.getSource() == beq) {
            b = Double.parseDouble(tf.getText());
            switch (operator) {
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4: result = a / b; break;
                default: result = 0;
            }
            tf.setText("" + result);
        }

        // Menghapus teks di layar kalkulator
        if (e.getSource() == bc)
            tf.setText("");
    }

    /**
     * Metode utama untuk menjalankan aplikasi kalkulator.
     * 
     * @param args Parameter command line (tidak digunakan).
     */
    public static void main(String[] args) {
        new Calculator();
    }
}
