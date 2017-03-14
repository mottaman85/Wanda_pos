//    Wanda POS  - Africa's Gift to the World
//    Copyright (c) 2014-2015 Wanda POS
//    http://www.wandaapos.com
//
//    This file is part of Wanda POS
//
//    Wanda POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   Wanda POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Wanda POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.ticket;

/**
 *
 * @author JG uniCenta
 */
public class ProviderInfo {
    
    private int m_iProviderID;
    private String m_sName;

    /** Creates new Provider */
    public ProviderInfo() {
        m_iProviderID = 0;
        m_sName = "";
    }
    
    /**
     *
     * @return
     */
    public int getProviderID() {
        return m_iProviderID;
    }
    
    /**
     *
     * @param iProviderID
     */
    public void setProviderID(int iProviderID) {
        m_iProviderID = iProviderID;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return m_sName;
    }
    
    /**
     *
     * @param sName
     */
    public void setName(String sName) {
        m_sName = sName;
    }
    
    public String toString(){
        return m_sName;
    }
}
