package Test;

class Overriding {
    public void m1(int a){
        System.out.println(a);
    }
}
    class Over1 extends Overriding{
        public void m1 (int a){
            System.out.println(a);
        }
    public static void main (String args []){
    	Overriding over = new Over1 ();
       over.m1(3); 
       
        
    }
}
