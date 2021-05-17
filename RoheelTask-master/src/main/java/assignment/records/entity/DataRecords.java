package assignment.records.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "records")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class DataRecords implements Serializable {

    @Id
    @Column(name ="msg_id")
    @JsonProperty("msg_id")
    private int msg_id;

    @Column(name = "company_name")
    @JsonProperty("company_name")
    private String company_name;

    @Column(name = "registration_date")
    @JsonProperty("registration_date")
    private ZonedDateTime registration_date;

    @Column(name = "score")
    @JsonProperty("score")
    private float score;


    @Column(name = "directors_count")
    @JsonProperty("directors_count")
    private int directors_count;

    @Column(name = "last_updated")
    @JsonProperty("last_updated")
    private ZonedDateTime last_updated;

    @Override
    public String toString() {
        return "Records{" +
                "msg_id=" + msg_id +
                ", company_name='" + company_name + '\'' +
                ", registration_date=" + registration_date +
                ", score=" + score +
                ", directors_count=" + directors_count +
                ", last_updated=" + last_updated +
                '}';
    }
}
