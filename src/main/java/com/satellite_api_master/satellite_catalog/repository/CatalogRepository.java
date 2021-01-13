package com.satellite_api_master.satellite_catalog.repository;


import com.satellite_api_master.satellite_catalog.model.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog,Long> {
}