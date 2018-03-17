package com.ft.briantaylorsoundboard;

/**
 * Created by hp on 16-Mar-18.
 */

public class Sound {
    private String name;
    private int resourceID;

    public Sound(String name, int resourceId) {
        this.name = name;
        this.resourceID = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }


}
