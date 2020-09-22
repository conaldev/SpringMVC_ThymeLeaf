package com.minh.service;

import com.minh.model.Province;
import com.minh.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    ProvinceRepository provinceRepository;


    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
