package org.clientserver.estol.commobject;

/**
 *
 * @author estol
 * @param <T>
 */
public interface CommunicationInterface<T>
{
    void setPayload(T o);
    T getPayload();
}
