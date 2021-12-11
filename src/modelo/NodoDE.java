/*
 * Copyright (C) 2021 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package modelo;

/**
 *
 * @author Oscar Arenas
 */
public class NodoDE {

    double dato;
    NodoDE anterior;
    NodoDE siguiente;

    public NodoDE(double dato) {
        this.dato = dato;
        anterior = null;
        siguiente = null;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public NodoDE getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDE anterior) {
        this.anterior = anterior;
    }

    public NodoDE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDE siguiente) {
        this.siguiente = siguiente;
    }
}
