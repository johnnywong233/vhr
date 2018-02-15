package org.sang.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * Created by sang on 2018/1/11.
 */
@Data
@NoArgsConstructor
public class JobLevel {
    private Long id;
    private String name;
    private String titleLevel;
    private Timestamp createDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobLevel jobLevel = (JobLevel) o;

        return name != null ? name.equals(jobLevel.name) : jobLevel.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public JobLevel(String name) {

        this.name = name;
    }

}
