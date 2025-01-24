package Thread;

import java.util.Scanner;

class ReverseGreet extends Thread
{
    int n;
    public ReverseGreet(int n){
        this.n=n;
    }
    // thread kise bhi order me run kar sktye hai isliye join use karna pdega or uski escepton handlung karni pdegi
    public void run(){
        if(n>0){

            System.out.println("CodeQuotiend Thread "+n);
            ReverseGreet newThread=new ReverseGreet(n-1);
            newThread.start();
            try{
                
                newThread.join();
            }
            catch(Exception e){

            }
        }
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ReverseGreet t1=new ReverseGreet(n);
        t1.start();
        





        sc.close();

    }
}
// input 6
// output
// thread 6
// thread 5
// thread 4
// thread 3
// thread 2
// thread 1


// runabe interface me ek hi method implement ho raha hota hai run method



// 
