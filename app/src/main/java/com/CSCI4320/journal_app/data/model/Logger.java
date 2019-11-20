package com.CSCI4320.journal_app.data.model;

import com.CSCI4320.journal_app.data.db.AppDatabase;

import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Logger{
    private int DID;
    private int UID;
    AppDatabase db;


    /*
    DID and UID are distinct for potential future expansion.
    See the security comments. Later I may want to track 2 user ids for security.
     */
    Logger(int UID, int DID){
        validityCheck();
        securityCheck();
        this.DID = DID;
        this.UID = UID;
    }
    /*
    TODO: make method to confirm device and user exist.
    Creation of device or user is NOT responsibility of this class
    Thus, I want it to create exception if either the user or the device do not exist
    Should this ever be possible? Unsure. But adding code handling the possibility means
    avoiding a hard crash at the very least.

    For now, the implementation of that will be handled later.
     */
    private void validityCheck(){
        System.out.println("Validity/existence checking is not implemented yet.\n" +
                "unknown behavior if accessing database object that doesn't exist.\n" +
                "Proceed with caution!\n \n");
    }
    /*
    Possible TODO: confirm user has permissions to access device
    Unsure if this is even an issue, or if the responsibility of other classes
    but I am leaving this here in case I want to add more later.

    Possible solution, if every device has a singleton logger object,
    then attempting to create another one should fail, and the UserIds can be checked.
     */
    private void securityCheck(){
        System.out.println("security checks are not yet implemented.\n" +
                "you may be able to modify and view other user's device logs at this time.\n" +
                "So please behave until this is covered.\n \n");
    }
    public String currentDateTime() {
        //commented out example code due to needing api 26.
        //uncomment this and the imports if desired to reimplement
        /*
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

        return formattedDate = formatter.format(LocalDate.now());
         */
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.format(new Date());
    }

    public int getDID() {
        return DID;
    }

    public void setDID(int DID) {
        this.DID = DID;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void log(String input)
    {
        DeviceLog toLog = new DeviceLog();
        toLog.deviceId = DID;
        toLog.userId = UID;
        toLog.date = currentDateTime();
        toLog.message = input;
        db.deviceLogDAO().insert(toLog);


    }
}