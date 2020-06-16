package com.jk.service.impl;

import com.jk.mapper.TempMapper;
import com.jk.pojo.Temp;
import com.jk.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    TempMapper tempMapper;


    @Override
    public List<Temp> selectPosition() {
        return tempMapper.selectPosition();
    }
}
