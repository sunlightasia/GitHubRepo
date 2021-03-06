<%--
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
--%>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<script>
Entity = {name: "planner", 
		model: function(options){ return new Planner( options );},
		collection: function(options){ return new Planner( {}, options );},
		editView: null,
		idStructure : <s:property value="#session.user.structure.id"/>
		};
</script>
<jsp:include page="layout/header_menu.jsp" />
      <div id="main">
        <!-- begin: #col1 - first float column -->
        <div id="col1" role="complementary">
          <div id="col1_content" class="clearfix">
          </div>
        </div><!-- end: #col1 -->
        <!-- begin: #col3 static column -->
        <div id="col3" role="main">
          <div id="col3_content" class="clearfix">
          <div class="header_section">
         	<p class="navigation"> <a class="home" href="<s:property value="url_home"/>?sect=planner">&nbsp;</a><b>»</b> 
			<span>&nbsp;</span></p>
    		<span class="name_section"><s:text name="booking"/></span>
          </div>
		<div>
<jsp:include page="contents/booking_form.jsp"/>
            </div>     
          </div>
<jsp:include page="layout/footer.jsp"/>