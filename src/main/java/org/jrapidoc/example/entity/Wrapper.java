/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jrapidoc.example.entity;

/**
 * 
 * @author Tomas "sarzwest" Jiricek
 */
public class Wrapper<T extends Destination> {

	public T destO;
	public String varInWrapper = "inWrapper";

	public Wrapper() {
	}

	public Wrapper(T destO) {
		this.destO = destO;
	}

	public void setDestO(T destO) {
		this.destO = destO;
	}

	public void setVarInWrapper(String varInWrapper) {
		this.varInWrapper = varInWrapper;
	}

}
