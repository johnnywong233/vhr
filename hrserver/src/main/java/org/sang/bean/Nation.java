package org.sang.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sang on 2018/1/12.
 */
@NoArgsConstructor
@Data
public class Nation {
    private Long id;
    private String name;

    public Nation(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nation nation = (Nation) o;

        return name != null ? name.equals(nation.name) : nation.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
