package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistence.mybatis.mappers.PropertyMapper;
import model.Property;

@Service
public class PropertyServiceImpl implements PropertyService {
	@Autowired
	private PropertyMapper propertyMapper = null;

	@Override
	public List<Property> findAllProperty() {
		return this.propertyMapper.findAllProperty();
	}

	public PropertyMapper getPropertyMapper() {
		return propertyMapper;
	}

	public void setPropertyMapper(PropertyMapper propertyMapper) {
		this.propertyMapper = propertyMapper;
	}

}
