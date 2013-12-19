package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import service.PropertyService;

@Path("/property/")
@Component
@Scope("prototype")
public class PropertyResource {
	@Autowired
	private PropertyService propertyService = null;

	@GET
	@Path("propertyList/available")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Property> availablePropertyTypeList() {
		return this.getPropertyService().findAllProperty();

	}

	public PropertyService getPropertyService() {
		return propertyService;
	}

	public void setPropertyService(PropertyService propertyService) {
		this.propertyService = propertyService;
	}
}
