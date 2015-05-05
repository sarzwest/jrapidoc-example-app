package org.jrapidoc.example.entity;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 *
 * @author Tomas "sarzwest" Jiricek
 */
public class DestinationEntity extends Destination {

    @JsonPropertyDescription("Description of id")
    private long id;

    public DestinationEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
