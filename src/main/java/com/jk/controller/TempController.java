package com.jk.controller;

import com.jk.pojo.Temp;
import com.jk.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
    private TempService tempService;


    @ResponseBody
    @PostMapping("/selectPosition")
    public List<Temp> selectPosition(){
        return tempService.selectPosition();
    }



}
