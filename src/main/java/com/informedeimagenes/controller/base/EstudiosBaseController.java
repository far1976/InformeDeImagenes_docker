package com.informedeimagenes.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.bson.types.ObjectId;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.informedeimagenes.db.informedeimagenes_db.service.EstudiosService;
import com.informedeimagenes.db.informedeimagenes_db.entity.Estudios;

//IMPORT RELATIONS
import com.informedeimagenes.db.informedeimagenes_db.entity.Estudios;

public class EstudiosBaseController {
    
    @Autowired
	EstudiosService estudiosService;



//CRUD METHODS

	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/estudios", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Estudios> getList() {
		return estudiosService.getList();
	}
	
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	
}
