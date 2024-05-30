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

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"inventory\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}