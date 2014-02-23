/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.clientserver.estol.commobject;

import java.io.Serializable;

/**
 *
 * @author Tim
 */
public class CommunicationObjectObjectPayload implements Serializable, CommunicationInterface<Object>
{
    private static final long serialVersionUID = 1270332257L;
    
    private Object payload;

    public CommunicationObjectObjectPayload() {}
    
    @Override
    public void setPayload(Object o)
    {
        payload = o;
    }

    @Override
    public Object getPayload()
    {
        return payload;
    }
    
}
