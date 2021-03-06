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
package pruebalistacircularde;

import modelo.ListaCircularDE;

/**
 *
 * @author Oscar Arenas
 */
public class PruebaListaCircularDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircularDE lista = new ListaCircularDE();

        lista.agregar(23);
        lista.agregar(80);
        lista.agregar(-15);
        lista.agregar(70.4);
        lista.agregar(64);

        System.out.println("Lista DE:");
        System.out.println(lista);

        lista.eliminar(1);
        System.out.println("Lista DE eliminar:");
        System.out.println(lista);
    }
}
