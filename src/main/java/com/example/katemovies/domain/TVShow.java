package com.example.katemovies.domain;


        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import com.example.katemovies.transfer.KeyValue;
        import lombok.*;

        import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "TVShows")
@SequenceGenerator(name = "idGenerator", sequenceName = "TVSHOWS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TVShow extends com.example.katemovies.domain.BaseEntity {

    @Column(length = 50, nullable = false )
    private String name;


    @Column(length = 20, nullable = false)
    private String channel;


    @Column(length = 30, nullable = false)
    private String Episode;


}

