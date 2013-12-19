package service;

import java.util.List;

import model.Property;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PropertyService {
	public List<Property> findAllProperty();
}
