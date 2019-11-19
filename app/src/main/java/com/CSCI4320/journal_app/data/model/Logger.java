package com.CSCI4320.journal_app.data.model;

import com.CSCI4320.journal_app.data.model.DeviceLog;
import com.CSCI4320.journal_app.data.model.DeviceLogDAO;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Logger {
    //I feel like some of this should be private, but we can discuss that later.
    private int deviceId;
    private int userId;
    public String message;
    public String date;


    /*
    DID and UID are distinct for potential future expansion.
    See the security comments. Later I may want to track 2 user ids for security.
     */
    Logger(int UID, int DID){
        validityCheck();
        securityCheck();
        deviceId = DID;
        userId = UID;
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
    /*
    Set current date and time to ISO 8601 compatible format
    May make separate class for everyone to call idk
     */
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
    /*
    This is to be as simplistic for devices as possible.
    example code for how I desire implementation

    Logger log = new Logger(UserId, deviceId);
    log.log(heartRate());
    Where basically the heartRate method returns a value that is parsed to string then logged

    Im not entirely sure what exactly I should be handing this data off to. As in, once the
    data is in the object, should it then give the string, user id, deviceid and whatnot to the
    database methods?
    Whatever. I wrote entirely too many comments here to be a normal human

 */
    //public void log(String input){
    //   DeviceLog logThis = new DeviceLog(deviceId,userId,currentDateTime(),input);
    //}



}