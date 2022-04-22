package com.marvrus.project.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvrus.project.web.model.doc.SampleDocs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/")
@Api(description = "코드 샘플", basePath = "/api/")
public class SampleController {

    @GetMapping(value = "sample")
    @ApiOperation(value = "샘플 조회 (단건)", notes = "샘플 조회 (단건)")
    public SampleDocs getSample() throws Exception {
        return SampleDocs.builder()
            .sampleId("hellow, marvrus.!")
            .contents("hello, marvrus")
            .build();
    }
}