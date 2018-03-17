package com.ft.briantaylorsoundboard;

/**
 * Created by Fabian Tauriello on 16-Mar-18.
 */

// This defines a Sound class which represents the data model being displayed by the RecyclerView

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
