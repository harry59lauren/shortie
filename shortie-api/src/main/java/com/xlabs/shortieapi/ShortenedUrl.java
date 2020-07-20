package com.xlabs.shortieapi;

import java.util.Date;
import java.util.Objects;
import javax.persistence.*;


@Entity
@Table(name = "shortend_url")
public class ShortenedUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlKey;
    private String url;

    @Temporal(TemporalType.TIMESTAMP)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(insertable = false, updatable = false)
    private Date createdAt;

    public ShortenedUrl() {
    }

    public ShortenedUrl(Long id, String urlKey, String url, Date createdAt) {
        this.id = id;
        this.urlKey = urlKey;
        this.url = url;
        this.createdAt = createdAt;
    }

    public ShortenedUrl(String urlKey, String url) {
        this.urlKey = urlKey;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ShortenedUrl{" +
                "id=" + id +
                ", urlKey='" + urlKey + '\'' +
                ", url='" + url + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
