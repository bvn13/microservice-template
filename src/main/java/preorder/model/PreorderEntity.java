package preorder.model;

import com.epam.template.preorder.PreorderDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class PreorderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String clientName;

    @Column
    private String clientEmail;

    @Column
    private String clientPhoneNumber;

    @Column
    private Long carTakePoint;

    @Column
    private Long carReturnPoint;

    @Column
    private Date dateFrom;

    @Column
    private Date dateTo;

}
