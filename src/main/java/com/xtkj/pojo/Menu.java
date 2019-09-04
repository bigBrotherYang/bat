package com.xtkj.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Menu implements Serializable {
    private static final long serialVersionUID = -3545843254048836515L;
    private Integer menuId;

    private String menuNamer;

    private String menuUrl;

    private String parentId;

    private String childId;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuNamer() {
        return menuNamer;
    }

    public void setMenuNamer(String menuNamer) {
        this.menuNamer = menuNamer == null ? null : menuNamer.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId == null ? null : childId.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuId, menu.menuId) &&
                Objects.equals(menuNamer, menu.menuNamer) &&
                Objects.equals(menuUrl, menu.menuUrl) &&
                Objects.equals(parentId, menu.parentId) &&
                Objects.equals(childId, menu.childId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(menuId, menuNamer, menuUrl, parentId, childId);
    }
}