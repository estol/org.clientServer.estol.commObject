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
