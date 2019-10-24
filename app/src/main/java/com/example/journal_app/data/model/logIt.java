package com.example.journal_app.data.model;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
class LogIt
{
  String UserID;
  String DeviceID;
  String Output = "default"; // stores the value being put out to the log.
  LocalDateTime RawDate = LocalDateTime.now(); //Date in LocalDateTime Format. Default is on creation of instance
  String Date = "Default O'Clock"; //for the date format turned into a string.
  //datetimeformatter is the format the RawDate is processed to when converting to string Date.
  DateTimeFormatter Format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
  
  LogIt(String UserIDInput, String DeviceIDInput)
  {
    UserID = UserIDInput;
    DeviceID = DeviceIDInput;
  }

  //this method updates the output. No method to change it without changing date
  //because that would defeat the entire point of the timestamp.
  void log(String Output)
  {
    Output = this.Output;
    setDate();
  }
  
  String getLog()
  {
    return Output;
  }
  
  String getDate()
  {
    return Date;
  }
  void setDate()
  {
    RawDate = LocalDateTime.now();
    Date = RawDate.format(Format);
  }
  String getUserID()
  {
    return UserID;
  }
  void setUser_ID(String UserID)
  {
    UserID = this.UserID;
  }
  String getDeviceID()
  {
    return DeviceID;
  }
  void setDeviceID(String DeviceID)
  {
    DeviceID = this.DeviceID;
  }
}