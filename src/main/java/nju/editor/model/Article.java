package nju.editor.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by river on 2/23/17.
 */
@Entity
public class Article{
    public static final String VERSION_RELEASE="RELEASE";
    public static final String VERSION_EDITING ="EDITING";
    public static final String VERSION_DELETED ="DELETED";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @Column(length = Integer.MAX_VALUE)
    private String html;
    private String version;
    private String type;
    private Long previousReleaseVersion;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getPreviousReleaseVersion() {
        return previousReleaseVersion;
    }

    public void setPreviousReleaseVersion(Long previousReleaseVersion) {
        this.previousReleaseVersion = previousReleaseVersion;
    }
}
