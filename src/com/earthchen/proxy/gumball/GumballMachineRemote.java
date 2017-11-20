package com.earthchen.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 */
public interface GumballMachineRemote extends Remote{

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;

}
