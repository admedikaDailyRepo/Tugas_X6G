/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tokobuku.tugasmembuatdatabseuser;

/**
 *
 * @author jeremiamanogi
 */
import javax.swing.JFrame;
public class TugasMembuatDatabseUser {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        JFrame frame = new JFrame("Form Pelanggan");

        Pelanggan panel = new Pelanggan(); // panggil class kamu

        frame.setContentPane(panel);
        frame.setSize(525, 1000); // sesuaikan ukuran
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // posisi tengah
        frame.setVisible(true);
    }
}
