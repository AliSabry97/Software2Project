package com.Softwareproject.Brandrepository;

import org.springframework.data.repository.CrudRepository;

import com.Softwareproject.Brands.Brand;

public interface Brandrepository extends  CrudRepository<Brand, Integer> {

}
