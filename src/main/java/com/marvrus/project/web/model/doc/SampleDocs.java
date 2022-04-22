package com.marvrus.project.web.model.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document
public class SampleDocs {
    @Id
    @ApiModelProperty(value = "식별자")
    private String sampleId;

    @ApiModelProperty("내용")
    private String contents;

    @Builder
    public SampleDocs(String sampleId, String contents) {
        this.sampleId = sampleId;
        this.contents = contents;
    }
}
