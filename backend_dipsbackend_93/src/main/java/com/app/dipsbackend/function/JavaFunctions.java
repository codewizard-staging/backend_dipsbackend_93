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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.dipsbackend.repository.OrganizationRepository;
import com.app.dipsbackend.repository.EmployeePersonalInfoRepository;
import com.app.dipsbackend.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
