--    Wanda POS - Africa's Gift to the World
--    Copyright (c) 2014-2015 Wanda POS
--    https://sourceforge.net/projects/wandaposdapos/
--
--    This file is part of Wanda POS.
--
--    Wanda POS is free software: you can redistribute it and/or modify
--    it under the terms of the GNU General Public License as published by
--    the Free Software Foundation, either version 3 of the License, or
--    (at your option) any later version.
--
--    Wanda POS is distributed in the hope that it will be useful,
--    but WITHOUT ANY WARRANTY; without even the implied warranty of
--    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
--    GNU General Public License for more details.
--
--    You should have received a copy of the GNU General Public License
--    along with Wanda POS.  If not, see <http://www.gnu.org/licenses/>.

-- Database create script for MySQL
-- Copyright (c) 2014-2015 Wanda POS



-- remove all foreign keys

ALTER TABLE PEOPLE DROP FOREIGN KEY PEOPLE_FK_1;
ALTER TABLE ATTRIBUTEINSTANCE DROP FOREIGN KEY ATTINST_SET;
ALTER TABLE ATTRIBUTEINSTANCE DROP FOREIGN KEY ATTINST_ATT;
ALTER TABLE ATTRIBUTESETINSTANCE DROP FOREIGN KEY ATTSETINST_SET;
ALTER TABLE ATTRIBUTEUSE DROP FOREIGN KEY ATTUSE_SET;
ALTER TABLE ATTRIBUTEUSE DROP FOREIGN KEY ATTUSE_ATT;
ALTER TABLE ATTRIBUTEVALUE DROP FOREIGN KEY ATTVAL_ATT;
ALTER TABLE CATEGORIES DROP FOREIGN KEY CATEGORIES_FK_1;
ALTER TABLE CUSTOMERS DROP FOREIGN KEY CUSTOMERS_TAXCAT;
ALTER TABLE LEAVES DROP FOREIGN KEY lEAVES_PPLID;
ALTER TABLE PAYMENTS DROP FOREIGN KEY PAYMENTS_FK_RECEIPT;
ALTER TABLE PLACES DROP FOREIGN KEY PLACES_FK_1;
ALTER TABLE PRODUCTS DROP FOREIGN KEY PRODUCTS_ATTRSET_FK;
ALTER TABLE PRODUCTS DROP FOREIGN KEY PRODUCTS_TAXCAT_FK;
ALTER TABLE PRODUCTS DROP FOREIGN KEY PRODUCTS_FK_1;
ALTER TABLE PRODUCTS_CAT DROP FOREIGN KEY PRODUCTS_CAT_FK_1;
ALTER TABLE PRODUCTS_COM DROP FOREIGN KEY PRODUCTS_COM_FK_1;
ALTER TABLE PRODUCTS_COM DROP FOREIGN KEY PRODUCTS_COM_FK_2;
ALTER TABLE RECEIPTS DROP FOREIGN KEY RECEIPTS_FK_MONEY;
ALTER TABLE RESERVATION_CUSTOMERS DROP FOREIGN KEY RES_CUST_FK_1;
ALTER TABLE RESERVATION_CUSTOMERS DROP FOREIGN KEY RES_CUST_FK_2;
ALTER TABLE SHIFT_BREAKS DROP FOREIGN KEY SHIFT_BREAKS_BREAKID;
ALTER TABLE SHIFT_BREAKS DROP FOREIGN KEY SHIFT_BREAKS_SHIFTID;
ALTER TABLE STOCKCURRENT DROP FOREIGN KEY STOCKCURRENT_ATTSETINST;
ALTER TABLE STOCKCURRENT DROP FOREIGN KEY STOCKCURRENT_FK_1;
ALTER TABLE STOCKCURRENT DROP FOREIGN KEY STOCKCURRENT_FK_2;
ALTER TABLE STOCKDIARY DROP FOREIGN KEY STOCKDIARY_ATTSETINST;
ALTER TABLE STOCKDIARY DROP FOREIGN KEY STOCKDIARY_FK_1;
ALTER TABLE STOCKDIARY DROP FOREIGN KEY STOCKDIARY_FK_2;
ALTER TABLE STOCKLEVEL DROP FOREIGN KEY STOCKLEVEL_PRODUCT;
ALTER TABLE STOCKLEVEL DROP FOREIGN KEY STOCKLEVEL_LOCATION;
ALTER TABLE TAXES DROP FOREIGN KEY TAXES_CAT_FK;
ALTER TABLE TAXES DROP FOREIGN KEY TAXES_CUSTCAT_FK;
ALTER TABLE TAXES DROP FOREIGN KEY TAXES_TAXES_FK;
ALTER TABLE TAXLINES DROP FOREIGN KEY TAXLINES_TAX;
ALTER TABLE TAXLINES DROP FOREIGN KEY TAXLINES_RECEIPT;
ALTER TABLE TICKETLINES DROP FOREIGN KEY TICKETLINES_ATTSETINST;
ALTER TABLE TICKETLINES DROP FOREIGN KEY TICKETLINES_FK_TICKET;
ALTER TABLE TICKETLINES DROP FOREIGN KEY TICKETLINES_FK_2;
ALTER TABLE TICKETLINES DROP FOREIGN KEY TICKETLINES_FK_3;
ALTER TABLE TICKETS DROP FOREIGN KEY TICKETS_CUSTOMERS_FK;
ALTER TABLE TICKETS DROP FOREIGN KEY TICKETS_FK_2;
ALTER TABLE TICKETS DROP FOREIGN KEY TICKETS_FK_ID;


-- DROP DEFAULT DATA

DELETE FROM ROLES;
DELETE FROM PEOPLE;
DELETE FROM RESOURCES;
DELETE FROM CATEGORIES;
DELETE FROM TAXCATEGORIES;
DELETE FROM TAXES;
DELETE FROM LOCATIONS;
DELETE FROM FLOORS;
DELETE FROM PLACES;
DELETE FROM SHIFTS;
DELETE FROM BREAKS;
DELETE FROM SHIFT_BREAKS;