/*
 * Copyright (C) 2014 Péter Szabó
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */


package org.clientserver.estol.commobject;

import java.io.Serializable;

/**
 *
 * @author Péter Szabó
 */
public class CommunicationObject implements Serializable,
        CommunicationInterface<String>
{
    
    /**
     * Explicitly declaring a serialVersionUID to avoid InvalidClassException
     * upon deserializing the object.
     */
    private static final long serialVersionUID = 8300632810L;
    
    /**
     * The variable that contains a string representing the payload in
     * this implementation.
     */
    private String payload;
    
    /**
     * Empty constructor, should be used when the payload is being retrieved.
     * 
     */
    public CommunicationObject() {}
    
    /**
     * Constructor which sets the payload as well as creating the object.
     * Just one less line of code in the application.
     * 
     * @param payload the payload of the object
     */
    public CommunicationObject(String payload)
    {
        setPayload(payload);
    }
    
    /**
     * Sets the payload of the object.
     * 
     * @param payload the payload of the object.
     */
    @Override
    public final void setPayload(String payload)
    {
        this.payload = payload;
    }
    
    /**
     * Retrieves the payload from the object.
     * 
     * @return the payload of the object.
     */
    @Override
    public final String getPayload()
    {
        return payload;
    }
}
