package com.company.bws.helpers;

import java.io.*;
import java.util.concurrent.locks.ReadWriteLock;

public class WriteFileThread implements Runnable{

    private String filename;
    private ReadWriteLock lock;

    public WriteFileThread(String filename, ReadWriteLock lock) {
        this.filename = filename;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.writeLock().lock();
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(filename), true)))){
            pw.printf(Thread.currentThread().getName() + " was here");// запись прямо в файл
            Thread.sleep(100);
        } catch (IOException e) {
            System.err.println("ошибка открытия потока " + e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
