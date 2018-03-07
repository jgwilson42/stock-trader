package com.diffblue.demo.stocktrader;

import com.diffblue.demo.stocktrader.ui.SplashScreen;

public class App {

  /**
   * Main entry point for the application.
   * @param args from the command line
   */
  public static void main(String[] args) {
    // On startup show the splash screen
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        SplashScreen.showSplashScreen();
      }
    });
  }
}
