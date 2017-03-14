//    Wanda POS  - Africa's Gift to the World
//    Copyright (c) 2014-2015 Wanda POS & previous Openbravo POS works
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

package com.openbravo.pos.scanpal2;

import com.openbravo.pos.forms.AppProperties;
import com.openbravo.pos.util.StringParser;

/**
 *
 * @author JG uniCenta
 */
public class DeviceScannerFactory {
    
    /** Creates a new instance of DeviceScannerFactory */
    private DeviceScannerFactory() {
    }
    
    /**
     *
     * @param props
     * @return
     */
    public static DeviceScanner createInstance(AppProperties props) {
        
        StringParser sd = new StringParser(props.getProperty("machine.scanner"));
        String sScannerType = sd.nextToken(':');
        String sScannerParam1 = sd.nextToken(',');
        // String sScannerParam2 = sd.nextToken(',');
        
        if ("scanpal2".equals(sScannerType)) {
            return new DeviceScannerComm(sScannerParam1);
        } else {
            return null;
        }
    }  
}
