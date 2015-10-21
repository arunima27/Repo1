package com.hcl;


public class Subscriptions
{
private Subscription Subscription;

public Subscription getSubscription ()
{
return Subscription;
}

public void setSubscription (Subscription Subscription)
{
this.Subscription = Subscription;
}

@Override
public String toString()
{
return "ClassPojo [Subscription = "+Subscription+"]";
}
}
