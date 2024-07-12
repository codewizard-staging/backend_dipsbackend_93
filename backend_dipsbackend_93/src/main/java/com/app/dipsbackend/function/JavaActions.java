package com.app.dipsbackend.function;

import com.app.dipsbackend.model.Organization;
import com.app.dipsbackend.model.EmployeePersonalInfo;
import com.app.dipsbackend.model.EmlpoyeeProfile;




import com.app.dipsbackend.enums.EmploymentType;
import com.app.dipsbackend.enums.OrgDept;
import com.app.dipsbackend.enums.OrgBranch;
import com.app.dipsbackend.converter.OrgBranchConverter;
import com.app.dipsbackend.converter.EmploymentTypeConverter;
import com.app.dipsbackend.converter.OrgDeptConverter;
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
  