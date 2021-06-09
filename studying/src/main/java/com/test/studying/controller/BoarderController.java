package com.test.studying.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.studying.dao.boarder.BoderDao;

@RestController
@MapperScan(basePackages="com.test.studying.dao.boarder")
public class BoarderController {

	@Autowired
	private BoderDao boderDao;
	
//	@RequestMapping("boder")
}
