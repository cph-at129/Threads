/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoThreads;

/**
 *
 * @author Aleksandar
 */
public class TwoThreads {

    public static class Thread1 extends Thread {
        
        public void run(){
            System.out.println("------------");
            System.out.println("A");
            System.out.println("B");
            System.out.println("------------");
        }
    }

    public static class Thread2 extends Thread {
       
        public void run(){
            System.out.println("------------");
            System.out.println("1");
            System.out.println("2");
            System.out.println("------------");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread1().start();
            new Thread2().start();
            
        }
        
    }
}
