/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncEx;

/**
 *
 * @author Aleksandar
 */
public class SyncExample {
    
    private static Object lockObject = new Object();
    private static int x = 0;
    private static int y = 0;
    
    private static class Thread1 extends Thread{
        
        public void run(){
            
            synchronized(lockObject){
                
                x=y=0;
                System.out.println(x);
            }
        }
        
    }
    private static class Thread2 extends Thread{
        
        public void run(){
         
            synchronized(lockObject){
                x = y = 1;
                System.out.println(y);
                System.out.println("-------");
            }
        }
    }
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            new Thread1().run();
            new Thread2().run();   
        }
        
    }
    
}
