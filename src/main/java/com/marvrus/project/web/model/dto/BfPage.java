package com.marvrus.project.web.model.dto;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BfPage {
    private int pageNo = 1;
    private int pageSize = 10;

    public BfPage(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }
    public Pageable generatePageable() {
        return PageRequest.of(pageNo - 1, pageSize);
    }

    public Pageable generatePageable(Sort.Direction direction, String fieldName) {
        return PageRequest.of(pageNo - 1, pageSize, Sort.by(direction, fieldName));
    }
}
