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
public class ListaCircularDE {

    private NodoDE primerNodo;
    private int n;

    public void agregar(double dato) {
        NodoDE nuevoNodo = new NodoDE(dato);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            primerNodo.siguiente = nuevoNodo;
        } else {
            NodoDE ultimoNodo = primerNodo.anterior;
            ultimoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimoNodo;
        }

        primerNodo.anterior = nuevoNodo;
        nuevoNodo.siguiente = primerNodo;
        n++;
    }

    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < n) {
            NodoDE actual = primerNodo;

            while (indice-- > 0) {
                actual = actual.siguiente;
            }

            if (actual == primerNodo) {
                primerNodo = primerNodo.siguiente;
                if (primerNodo == primerNodo.siguiente) {
                    primerNodo = null;
                } else {
                    primerNodo.anterior = actual.anterior;
                    actual.anterior.siguiente = primerNodo;
                }
            } else {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            }
            n--;
            return true;
        }
        return false;
    }

    public double obtener(int indice) {
        return 0;
    }

    public boolean modificar(int indice, double dato) {
        return false;
    }

    public boolean contiene(double dato) {
        return false;
    }

    public int tamanio() {
        return n;
    }

    public boolean esVacia() {
        return true;
    }

    @Override
    public String toString() {
        String cadena = "";

        if (primerNodo != null) {
            NodoDE actual = primerNodo;

            while (actual.siguiente != primerNodo) {
                cadena += realACadena(actual.dato) + ", ";
                actual = actual.siguiente;
            }
            cadena += realACadena(actual.dato);
        }
        return "[" + cadena + "]";
    }

    private String realACadena(double real) {
        int entero = (int) real;
        String cadena = real + "";

        if (real == entero) {
            cadena = entero + "";
        }
        return cadena;
    }
}
