/*******************************************************************************
 *
 *  Copyright 2011 - Sardegna Ricerche, Distretto ICT, Pula, Italy
 *
 * Licensed under the EUPL, Version 1.1.
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *  http://www.osor.eu/eupl
 *
 * Unless required by applicable law or agreed to in  writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 * In case of controversy the competent court is the Court of Cagliari (Italy).
 *******************************************************************************/
package persistence.mybatis.mappers;

import java.util.Map;

public interface FacilityImageMapper {	
	public Integer insert(Map map);	
	
	public Map findByIdFacility(Integer id_facility);
	public Map findByIdImage(Integer id_image);
	public Integer delete(Integer id);
	public Integer deleteByIdImage(Integer id_image);	
	public Integer deleteByIdFacility(Integer id_facility);			
}