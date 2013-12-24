package persistence.mybatis.mappers;

import java.util.List;
import java.util.Map;

public interface StructurePropertyMapper {
public Integer insert(Map map);
	
	public Integer delete(Integer id);	
	public Integer deleteByIdStructure(Integer id_structure);	
	public Integer deleteByIdProperty(Integer id_property);	
	
	public List<Map> findByIdStructure(Map map);
	public Integer findIdByIdStructureAndIdProperty(Map map);
}
