/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. S�nchez (luciano@uniovi.es)
    J. Alcal�-Fdez (jalcala@decsai.ugr.es)
    S. Garc�a (sglopez@ujaen.es)
    A. Fern�ndez (alberto.fernandez@ujaen.es)
    J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/

/**
 * <p>
 * @author Writed by Alberto Fernández (University of Granada) 15/01/2006
 * @version 2.0
 * @since JDK1.5
 * </p>
 */

package keel.Algorithms.Subgroup_Discovery.SDAlgorithm;

import java.util.*;

public class SetData{

    /**
     * <p>
     * Data structure for the examples
     * </p>
     */

    private LinkedList datos;

    /**
     * <p>
     * Constructor
     * </p>
     */
    public SetData() {
        datos = new LinkedList();
    }

    /**
     * <p>
     * Delete a data
     * </p>
     * @param int               Position to delete
     */
    public void deleteDato(int i) {
        datos.remove(i);
    }

    /**
     * <p>
     * Add a data
     * </p>
     * @param Instance              Instance to add
     */
    public void addDato(Instance m) {
        Instance mim = m.copy();
        datos.add(mim);
    }

    /**
     * <p>
     * Return an instance
     * </p>
     * @param int               Position of the instance
     * @return                  The instance indicated in the position
     */
    public Instance getDato(int i) {
        return (Instance) datos.get(i);
    }

    /**
     * <p>
     * Sets an instance
     * </p>
     * @param int               Position to insert the instance
     * @param Instance          Instance to insert
     */
    public void setDato(int i, Instance m) {
        datos.set(i, m);
    }

    /**
     * <p>
     * Return the number of instances
     * </p>
     * @return                  The size of the dataset
     */
    public int size() {
        return (datos.size());
    }

    /**
     * <p>
     * Show an instance
     * </p>
     */
    public void print() {
        for (int i = 0; i < datos.size(); i++) {
            Instance m = (Instance) datos.get(i);
            m.print();
        }

    }

    /**
     * <p>
     * Copy the dataset in another
     * </p>
     * @return                  A new dataset
     */
    public SetData copiaConjDatos() {
        SetData c = new SetData();

        for (int i = 0; i < datos.size(); i++) {
            Instance aux;
            Instance m = (Instance) datos.get(i);
            aux = m.copy();
            c.addDato(aux);
        }

        return c;
    }

}
