package com.diffblue.demo.stocktrader.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SplashScreen {

  /**
   * Display the splash screen to the user.
   */
  public static void showSplashScreen() {
    JFrame splashFrame = new JFrame("Stock Trader Splash Screen");
    splashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel welcome = new JLabel("Welcome to the Stock Trader");
    splashFrame.getContentPane().add(welcome);

    splashFrame.pack();
    splashFrame.setVisible(true);
  }
}
