package com.hcl;

public class Subscription
{
    private String ID;

    private String OptStatus;

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getOptStatus ()
    {
        return OptStatus;
    }

    public void setOptStatus (String OptStatus)
    {
        this.OptStatus = OptStatus;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ID = "+ID+", OptStatus = "+OptStatus+"]";
    }
}
			
		
