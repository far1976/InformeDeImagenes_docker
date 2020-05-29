package com.informedeimagenes.db.informedeimagenes_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informedeimagenes.db.informedeimagenes_db.entity.Estudios;

//IMPORT RELATIONS
import com.informedeimagenes.db.informedeimagenes_db.entity.Estudios;

@Service
public class EstudiosBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    
    	
    //CRUD - GET LIST
    	
	public List<Estudios> getList() {
		return (ArrayList<Estudios>) datastore.find(Estudios.class).asList();
	}

    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in EstudiosService.java
     */
    


}
