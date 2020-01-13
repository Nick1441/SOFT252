/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Other;

/**
 *
 * @author Nick1
 */
public class Notify {
    String NotifyID;
    String Info;

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
