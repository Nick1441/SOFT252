/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

/**
 * This is Mostly Notification pattern.
 * Creates New Notification with Destination and Infomation to show.
 */
public class Notify {
    private String NotifyID;
    private String Info;

    public Notify(String NotifyID, String Info) {
        this.NotifyID = NotifyID;
        this.Info = Info;
    }

    public String getNotifyID() {
        return NotifyID;
    }

    public void setNotifyID(String NotifyID) {
        this.NotifyID = NotifyID;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }
    
    
}
