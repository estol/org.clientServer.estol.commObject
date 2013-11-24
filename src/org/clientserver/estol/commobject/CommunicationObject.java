package org.clientserver.estol.commobject;

import java.io.Serializable;

/**
 *
 * @author estol
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
