package damian.garbacz.kosmos.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourists")
@Getter
@Setter
public class Tourist {

    @Id
    @GeneratedValue
    private Long id;
}
