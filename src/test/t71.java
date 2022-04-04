package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class t71 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Semaphore mutex = new Semaphore(1);
        Semaphore  empty = new Semaphore(10);
        Semaphore  full = new Semaphore(0);
        Producer pro = new Producer(shop,mutex,empty,full);
        Cousumer cou = new Cousumer(shop,mutex,empty,full);
        new Thread(pro).start();
        new Thread(cou).start();

    }

}

class Product {


}

class Shop {

    private static List<Product> list = new ArrayList<Product>();
    public synchronized  void  produ() {
        while (list.size()== 10) {
            try {
                System.out.println(
                        "full,waiting fo produce");

            }  catch(Exception e)
            {e.printStackTrace();}

        }
        Product product = new Product();

        list.add(product);
        System.out.println("producing"  );
        System.out.println("amount of product is " + list.size());

    }

    public synchronized void cousu() {
        while (list.size() == 0) {
            System.out.println("empty ,waiting for comsume");
        }
        list.remove(0);
        System.out.println("comsuming" );
        System.out.println("amount of product is " + list.size());
    }
}

class Cousumer implements Runnable {
    private Shop shop;
    private Semaphore mutex;
    private Semaphore empty;
    private Semaphore full;
    public Cousumer(Shop shop,Semaphore mutex,Semaphore empty,Semaphore full) {
        this.shop = shop;
        this.mutex = mutex;
        this.empty=empty;
        this.full=full;
    }
    public void run() {
        while (true) {
            try {
                empty.acquire();
                mutex.acquire();
                Thread.sleep(1000);
                shop.cousu();
                mutex.release();
                full.release();
            }  catch(Exception e)
            {e.printStackTrace();}

        }
    }
}

class Producer implements Runnable {
    private Shop shop;
    private Semaphore mutex;
    private Semaphore empty;
    private Semaphore full;
    public Producer(Shop shop,Semaphore mutex,Semaphore empty,Semaphore full) {
        this.shop = shop;
        this.mutex = mutex;
        this.empty=empty;
        this.full=full;
    }
    public void run() {
        while (true) {
            try {
                full.acquire();
                mutex.acquire();
                Thread.sleep(1000);
                shop.produ();
                mutex.release();
                empty.release();
            }  catch(Exception e)
            {e.printStackTrace();}
        }
    }
}

