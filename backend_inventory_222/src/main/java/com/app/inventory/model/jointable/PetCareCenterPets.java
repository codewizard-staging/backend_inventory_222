package com.app.inventory.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.inventory.model.Pet;
import com.app.inventory.model.PetCareCenter;
import com.app.inventory.model.PetOwner;
import com.app.inventory.model.Document;
import com.app.inventory.model.PetService;
import com.app.inventory.enums.PetServiceType;
import com.app.inventory.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"inventory\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}