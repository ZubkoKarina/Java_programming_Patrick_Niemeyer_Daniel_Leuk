package com.mycompany.java_programming_patrick_niemeyer_daniel_leuk;


import javax.swing.*;
public class HelloJava 
{
  public static void main( String[] args ) {
    JFrame frame = new JFrame( "HelloJava" );
    frame.add( new HelloComponent() );
    frame.setSize( 300, 300 );
    frame.setVisible( true );
  }
}
class HelloComponent extends JComponent {
  public void paintComponent( java.awt.Graphics g ) {
    g.drawString( "Hello, Java!", 125, 95 );
  }
}