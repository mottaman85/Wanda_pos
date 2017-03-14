//    Wanda POS - Africa's Gift to the World
//    Copyright (c) 2014-2015 IT-Kamer & previous Unicenta POS and Openbravo POS works
//    www.erp-university-africa.com
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

package cm.wandapos.webservices.model;

/**
 * 
 * @author Ing. Tatioti Mbogning Raoul
 */
public class MWebServiceMethod {
    
    private String m_name;
    private String m_value;
    private String m_description;
    private String m_help;
    private String m_webServiceID;

    public MWebServiceMethod(String webServiceID, String name, String value, String description, String help) {
        this.m_webServiceID = webServiceID;
        this.m_name = name;
        this.m_value = value;
        this.m_description = description;
        this.m_help = help;
    }
    
    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        this.m_name = name;
    }

    public String getValue() {
        return m_value;
    }

    public void setValue(String value) {
        this.m_value = value;
    }

    public String getDescription() {
        return m_description;
    }

    public void setDescription(String description) {
        this.m_description = description;
    }

    public String getHelp() {
        return m_help;
    }

    public void setHelp(String help) {
        this.m_help = help;
    }
    
    public String getWebServiceID() {
        return m_webServiceID;
    }

    public void setWebServiceID(String webServiceID) {
        this.m_webServiceID = webServiceID;
    }
}
