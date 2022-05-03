package indra.makers.portafolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "tb_portafolio")
public class Portafolio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_portafolio")
    private int id_portafolio;

    @Column (name = "name_portafolio")
    private String name_portafolio;

    @Column (name= "name_user")
    private String name_user;

    @Column (name= "id_coin")
    private int id_coin;

    public Portafolio() {
    }

    public Portafolio(int id_portafolio, String name_portafolio, String name_user, int id_coin) {
        this.id_portafolio = id_portafolio;
        this.name_portafolio = name_portafolio;
        this.name_user = name_user;
        this.id_coin = id_coin;
    }

    public int getId_portafolio() {
        return id_portafolio;
    }

    public void setId_portafolio(int id_portafolio) {
        this.id_portafolio = id_portafolio;
    }

    public String getName_portafolio() {
        return name_portafolio;
    }

    public void setName_portafolio(String name_portafolio) {
        this.name_portafolio = name_portafolio;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public int getId_coin() {
        return id_coin;
    }

    public void setId_coin(int id_coin) {
        this.id_coin = id_coin;
    }
}
