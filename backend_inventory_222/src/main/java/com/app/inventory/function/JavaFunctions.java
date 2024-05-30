package com.app.inventory.function;

import com.app.inventory.model.Pet;
import com.app.inventory.model.PetCareCenter;
import com.app.inventory.model.PetOwner;
import com.app.inventory.model.Document;
import com.app.inventory.model.PetService;
import com.app.inventory.enums.PetServiceType;
import com.app.inventory.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.inventory.repository.PetServiceRepository;
import com.app.inventory.repository.PetOwnerRepository;
import com.app.inventory.repository.PetCareCenterRepository;
import com.app.inventory.repository.DocumentRepository;
import com.app.inventory.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
