package com.app.inventory.function;

import com.app.inventory.model.Pet;
import com.app.inventory.model.PetCareCenter;
import com.app.inventory.model.PetOwner;
import com.app.inventory.model.Document;
import com.app.inventory.model.PetService;




import com.app.inventory.enums.PetServiceType;
import com.app.inventory.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  