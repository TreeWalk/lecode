package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
public class t7 {
	public static void main(String[] args) {
	        Shop1 shop1 = new Shop1();
	        Producer1 pro = new Producer1(shop1);
	        Cousumer1 cou = new Cousumer1(shop1);
	        new Thread(pro).start();
	        new Thread(cou).start();
		System.out.println("test T7");
	       	       
	}

}

 class Product1 {


}

 class Shop1 {
     Semaphore  mutex = new Semaphore(1);
     Semaphore  empty = new Semaphore(10);
     Semaphore  full = new Semaphore(0);

     private static List<Product> list = new ArrayList<Product>();
        public synchronized  void  produ() throws InterruptedException { //生产者进程
        Product product = new Product();
        try{empty.acquire();
            mutex.acquire();
            list.add(product);
            System.out.println("producing"  );
            System.out.println("amount of product is " + list.size());
            mutex.release();
            full.release();
        }catch (Exception e){
            System.out.println(
                    "full,waiting fo produce");
            e.printStackTrace();
        }

    }

    public synchronized void cousu() throws InterruptedException {
        try{full.acquire();
            mutex.acquire();
            list.remove(0);
            mutex.release();
            empty.release();
            System.out.println("comsuming" );
            System.out.println("amount of product is " + list.size());
        }catch(Exception e){
            System.out.println("empty ,waiting for comsume");
            e.printStackTrace();
        }

    }
}

 class Cousumer1 implements Runnable { //顾客线程
    private Shop1 shop1;
    public Cousumer1(Shop1 shop1) {
        this.shop1 = shop1;
    }
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                shop1.cousu();
                }  catch(Exception e)
            {e.printStackTrace();}

        }
    }
}

 class Producer1 implements Runnable {//生产者线程
    private Shop1 shop1;
    public Producer1(Shop1 shop1) {
        this.shop1 = shop1;
    }
    public void run() { //线程运行
        while (true) { //运行生产
            try {
                Thread.sleep(1000);
                shop1.produ();
                }  catch(Exception e)
	                {e.printStackTrace();}
        }
    }
}
