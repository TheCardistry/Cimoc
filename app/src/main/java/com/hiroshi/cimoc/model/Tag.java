package com.hiroshi.cimoc.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by Hiroshi on 2016/10/10.
 */
@Entity
public class Tag implements Card {

    @Id(autoincrement = true) private Long id;
    @NotNull private String title;
    /**
     *  0 - 200 source
     *  250 continue
     *  251 end
     *  300 normal
     */
    @NotNull private int type;
    @NotNull private boolean enable;

    @Generated(hash = 659343159)
    public Tag(Long id, @NotNull String title, int type, boolean enable) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.enable = enable;
    }

    @Generated(hash = 1605720318)
    public Tag() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean getEnable() {
        return this.enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

}
