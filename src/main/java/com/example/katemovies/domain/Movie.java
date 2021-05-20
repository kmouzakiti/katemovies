package com.example.katemovies.domain;


        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import com.example.katemovies.transfer.KeyValue;
        import lombok.*;

        import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Movies")
@SequenceGenerator(name = "idGenerator", sequenceName = "MOVIES_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Movie extends com.example.katemovies.domain.BaseEntity {

    @Column(length = 50, nullable = false )
    private String title;


    @Column(length = 20, nullable = false)
    private String rating;

    @Column(length = 20, nullable = true)
    private String year;


    @Column(length = 20, nullable = true)
    private String producer;

    @Column(length = 20, nullable = true)
    private String type;


}

