package com.app.sportcity.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Menu {

    @SerializedName("term_id")
    @Expose
    private Integer termId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("term_group")
    @Expose
    private Integer termGroup;
    @SerializedName("term_taxonomy_id")
    @Expose
    private Integer termTaxonomyId;
    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("parent")
    @Expose
    private Integer parent;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("filter")
    @Expose
    private String filter;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getTermGroup() {
        return termGroup;
    }

    public void setTermGroup(Integer termGroup) {
        this.termGroup = termGroup;
    }

    public Integer getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(Integer termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}