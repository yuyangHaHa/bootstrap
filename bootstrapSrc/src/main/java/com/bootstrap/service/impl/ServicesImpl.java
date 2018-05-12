package com.bootstrap.service.impl;

import com.bootstrap.mapper.Mappers;
import com.bootstrap.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements Services {

    @Autowired
    private Mappers mappers;

}
