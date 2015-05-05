/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jrapidoc.example.entity;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 *
 * @author Tomas "sarzwest" Jiricek
 */

public class Destination{

    @JsonPropertyDescription("Description of name")
	private String name;

    public Destination() {
    }

    public Destination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
