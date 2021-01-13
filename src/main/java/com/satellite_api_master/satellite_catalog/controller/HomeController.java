package com.satellite_api_master.satellite_catalog.controller;


import com.satellite_api_master.satellite_catalog.model.Catalog;
import com.satellite_api_master.satellite_catalog.service_implementation.CatalogImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Postman is used to do operations
// Therefore need to add cross origin annotation
@CrossOrigin("*")
public class HomeController {

    // To create bean of implementation class
    @Autowired
    private CatalogImplementation catalogImplementation;

    // To call save method or to save new catalog
    @PostMapping(value = "saveCatalog")
    public Catalog saveCatalog(@RequestBody Catalog catalog){
        System.out.println("Catalog save works properly!");
        catalogImplementation.saveCatalog((catalog));
        return catalog;
    }

    // Find all catalog from db
    @GetMapping(value = "getAllCatalog")
    public List<Catalog> findAllCatalog(){
        return  catalogImplementation.findAllCatalog();
    }

    // Update catalog
    @PutMapping("updateCatalog")
    public Catalog updateCatalog(@RequestBody Catalog catalog){
        return catalogImplementation.updateCatalog(catalog);
    }

    // Delete catalog
    @DeleteMapping("deleteCatalog")
    public String deleteCatalog(@RequestParam long id){
        catalogImplementation.deleteCatalog(id);
        return "Catalog Deleted!";
    }

}

