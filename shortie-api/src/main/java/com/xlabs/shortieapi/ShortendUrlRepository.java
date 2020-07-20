package com.xlabs.shortieapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortendUrlRepository extends CrudRepository<ShortenedUrl, Long> {

    public ShortenedUrl findByUrlKey(String urlKey);

}
