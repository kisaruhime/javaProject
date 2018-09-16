package com.company.bws.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.ReadWriteLock;

public class ReadFileThread implements Runnable {

    private String filename;
    private ReadWriteLock lock;

    public ReadFileThread(String filename, ReadWriteLock lock) {
        this.filename = filename;
        this.lock = lock;
    }

    @Override
    public void run() {

        lock.readLock().lock();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String tmp = "";
            System.out.println(Thread.currentThread().getName() + " now is reading from file " + filename);
            while ((tmp = br.readLine()) != null) {
                //String[] s = tmp.split("\\s");
                System.out.println(tmp);
            }
            Thread.sleep(100);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();

        }

    }

}
