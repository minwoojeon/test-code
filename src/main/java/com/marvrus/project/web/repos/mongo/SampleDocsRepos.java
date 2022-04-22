package com.marvrus.project.web.repos.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marvrus.project.web.model.doc.SampleDocs;

@Repository
public interface SampleDocsRepos extends MongoRepository<SampleDocs, String> {
}
