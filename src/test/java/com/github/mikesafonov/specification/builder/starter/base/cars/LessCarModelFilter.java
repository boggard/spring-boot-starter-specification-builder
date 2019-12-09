package com.github.mikesafonov.specification.builder.starter.base.cars;

import com.github.mikesafonov.specification.builder.starter.annotations.LessThan;
import com.github.mikesafonov.specification.builder.starter.annotations.LessThanEqual;
import com.github.mikesafonov.specification.builder.starter.annotations.Name;

/**
 *
 * @author MikeSafonov
 */
public class LessCarModelFilter {
    @LessThan
    private Integer id;

    @LessThanEqual
    @Name("id")
    private Integer idEqual;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEqual() {
        return idEqual;
    }

    public void setIdEqual(Integer idEqual) {
        this.idEqual = idEqual;
    }
}