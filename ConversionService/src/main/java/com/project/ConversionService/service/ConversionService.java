package com.project.ConversionService.service;

import java.util.List;

import com.project.ConversionService.pojo.ConversionPojo;

public interface ConversionService {

//	List<ConversionPojo> getCurrency();
	ConversionPojo getCurrency(Integer cId);
}
