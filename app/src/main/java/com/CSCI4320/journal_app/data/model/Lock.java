package com.CSCI4320.journal_app.data.model;
import java.util.Timer;
import java.util.TimerTask;

public class Lock {

    private int DID;
    private int UID;
    //true = closed, false = open
    private boolean Locked;
    private int timeToLock;
    private boolean autoReLock;
    Timer timer;
    //initially made with default values.
    Logger a;

    public Lock(int DID, int UID) {
        this.DID = DID;
        this.UID = UID;
        Locked = true;
        a = new Logger(UID,DID);
        a.log("Initialization");

    }

    public Lock(int DID, int UID, int LockTime) {
        this.DID = DID;
        this.UID = UID;
        autoReLock = true;
        timeToLock = LockTime;
        a = new Logger(UID,DID);
        a.log("Initialization");
    }

    //most of this is just generic get/setters. a few were changed to be more external use friendly
    //although this seems... insecure. And pointless in some cases.

    public int getTimeToLock() {
        return timeToLock;
    }

    public void setTimeToLock(int timeToLock) {
        this.timeToLock = timeToLock;
    }

    public Boolean isLocked() {
        return Locked;
    }
    //no generic setter because that defeats the whole point lol

    public boolean isAutoReLock() {
        return autoReLock;
    }

    public void setAutoReLock(boolean autoReLock) {
        this.autoReLock = autoReLock;
    }

    class TimeLock extends TimerTask {

        public void run() {
            relock();
            timer.cancel();
        }
    }

    public void unlock() {
        Locked = false;
        a.log("Unlocked");
        if (isAutoReLock()) {
            timer = new Timer();
            timer.schedule(new TimeLock(), timeToLock * 1000);
        }

    }

    public void relock() {
        Locked = true;
        a.log("Relocked");
    }
}