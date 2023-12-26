/**
 * 
 */
package com.soa.dto;

import java.util.List;

/**
 * 
 */
public class Factura {
    private List<Productos> productos;

    /**
     * @return the productos
     */
    public List<Productos> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}
