package resources;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import service.PropertyService;
import service.StructurePropertyService;

@Path("/structureProperty/")
@Component
@Scope("prototype")
public class StructurePropertyResource {
	@Autowired
	private PropertyService propertyService = null;

	@Autowired
	private StructurePropertyService structurePropertyService = null;
	
	

	public PropertyService getPropertyService() {
		return propertyService;
	}

	public void setPropertyService(PropertyService propertyService) {
		this.propertyService = propertyService;
	}

	public StructurePropertyService getStructurePropertyService() {
		return structurePropertyService;
	}

	public void setStructurePropertyService(
			StructurePropertyService structurePropertyService) {
		this.structurePropertyService = structurePropertyService;
	}
}
