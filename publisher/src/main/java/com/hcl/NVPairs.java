package com.hcl;

public class NVPairs
{
    private NVPair NVPair;

    public NVPair getNVPair ()
    {
        return NVPair;
    }

    public void setNVPair (NVPair NVPair)
    {
        this.NVPair = NVPair;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NVPair = "+NVPair+"]";
    }
}