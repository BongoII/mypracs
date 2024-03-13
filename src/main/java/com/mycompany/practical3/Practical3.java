/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3;
import javax.swing.JOptionPane;
public class Practical3 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name of a goat ");
        JOptionPane.showMessageDialog(null, "hi"+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "how old are u "));
     JOptionPane.showMessageDialog(null,  name + age);
     
     
    }
}