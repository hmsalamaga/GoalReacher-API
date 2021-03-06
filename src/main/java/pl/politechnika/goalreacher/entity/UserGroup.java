package pl.politechnika.goalreacher.entity;

import lombok.Getter;
import lombok.Setter;
import pl.politechnika.goalreacher.model.Role;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserGroup
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    AppUser user;

    @ManyToOne
    @JoinColumn(name = "group_id")
    AppGroup group;

    Role role;

    private boolean googleCalendar;

}
