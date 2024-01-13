package com.neonsportsclub.app.model.bus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created by Kartick Vijayakumar.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(
        name = "stop",
        indexes = @Index(
                name = "idx_stop_code",
                columnList = "code",
                unique = true
        )
)
public class Stop {
    @Id
    @Column(name = "stop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private String detail;
}
